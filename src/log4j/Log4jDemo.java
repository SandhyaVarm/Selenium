package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
	 Logger log = Logger.getLogger("Googlesearch"); 
	 PropertyConfigurator.configure("Log4j.properties"); 
	  driver = new ChromeDriver();
	  log.info("Chrome Browser lunched");
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
	 driver.get("https://www.google.com"); 
	 log.info("Navigate Google Url");                              
	 driver.findElement(By.name("q")).sendKeys("Tirupathi");
	 log.info("Enter Tripathi in google search");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 log.info("Enter button press in keyboard");
	 
	 
	 
  }
}
