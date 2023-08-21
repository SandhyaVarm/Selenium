package sikulix;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikulixDesktopWeb {
	
    WebDriver driver;	
	Screen s = new Screen();
	
  @Test
  public void f() throws FindFailed {
	 driver.get("http://www.seleniumlearn.com"); 
	  s.click("C:\\sikulix\\Testng.JPG");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
