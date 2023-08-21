package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;
	 @Test(enabled=false)
	  public void twitter() {
		  driver.get("https://www.twitter.com");
		  
	  }
	  
	 @Test(enabled=false)
	  public void facebook(){
		  driver.get("https://www.facebook.com");
		  
	  }
	 @Test(priority=3)
	  public void gmail() {
		  driver.get("https://www.gmail.com");
		  
	  }
	 @Test(priority=2)
	  public void google() {
		  driver.get("https://www.google.com");
		  
	  }
	   @Test(priority=1)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
	  
  }
  
  @Test(priority=0)
  public void zomato() {
	  driver.get("https://www.zomato.dev");
	  
  }
  
 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
