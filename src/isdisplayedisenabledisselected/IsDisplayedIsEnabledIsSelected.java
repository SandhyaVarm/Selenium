package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayedIsEnabledIsSelected {

	WebDriver driver;
	@Test(enabled=false)
	public void isDisplayed() {

		driver.get("https://www.redmine.org/");


		Boolean hm = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a")).isDisplayed();

		if( hm==true)
		{  System.out.println("Home menu link is available"); 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a")).click();
		}
		else
		{
			System.out.println("Home menu link is not available");
		}
	}
	@Test(enabled=false)
	public void isEnabled() {

		driver.get("https://www.redmine.org/login");
          
		Boolean log = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	    if(log==true)
	    { System.out.println("login text box is enabled to enter username");
	      driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sandhya");
	    }
	    else
	    {	
	    System.out.println("login in text box is not enabled to enter username");    
	    }
	}
		@Test
		public void isSelected() {

	     driver.get("https://www.redmine.org/login");
	  
	      Boolean stay = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	     if(stay==true)
	     {  System.out.println("stay logged checked is selected");
	    	driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	     }
	     else
	     {
	    System.out.println("stay logged check box is not selected");
	
	     }
	}


	







	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();




	}

}
