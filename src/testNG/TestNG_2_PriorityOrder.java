package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_2_PriorityOrder {
	WebDriver driver;
     
  
	 @Test(priority=5)
	  public void google() {
		  driver.get("https://www.google.com");
		  
	  }
	 @Test(priority=4)
	  public void gmail() {
		  driver.get("https://www.gmail.com");
		  
	  }
	 @Test(priority=3)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
		  
	  }
	 @Test(priority=2)
	  public void twitter() {
		  driver.get("https://www.twitter.com");
		  
	  }
	 @Test	(priority=1)  
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
		  
	  }
	 @Test(priority=0)
	  public void zomato() {
		  driver.get("https://www.zomato.com");
		  
	  }
	  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
 
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
