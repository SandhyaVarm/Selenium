package assertequals;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class AssertDemo {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("https://www.redmine.org/");
	  
	  
	  
  }
  

@BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
