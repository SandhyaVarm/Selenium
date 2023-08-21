package testNG;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNG_8_DataProvider {
	
	WebDriver driver;
	public String str;
	
	@DataProvider(name ="datainput")
	public String[] []   login (){
	 return new String[][] {
		 {"sandhya","InValidPassword"},
		 {"jaalaja", "9000109120"},
		 {"hema" ,"ABCDEF"},
		 {"sudha","123456789"} ,
	     {"indraja","ABCDEFGHI"	 },
	     {"mohana","9980251000" },
	     {"usha","InValidPassword"},
	     {"shiva","Hello@123"}	
	};
	}
	     
	
	
  @Test(dataProvider =  "datainput")
  public void login(String login ,String Password) {
	  driver.get("http://ts07.in/user");
	   
	driver.findElement(By.id("edit-name")).sendKeys(login);  
	driver.findElement(By.id("edit-pass")).sendKeys(Password);
    driver.findElement(By.id("edit-submit")).click() ;
  
      try
        {
        driver.findElement(By.linkText("Log out")).click();
        str = "pass";
        System.out.println(str);    
        }
      
    catch (Exception e)
            {
    	
    	str = "fail";
    	System.out.println(str);
            }
    	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
