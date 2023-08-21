package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNG_9_CrossBrowserTesting {                           	      
	public WebDriver driver;

  @Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser)  { 
	try {  
	  
	  if(browser.equalsIgnoreCase("Chrome")) {
	 // System.setProperty("webdriver. chrome .driver","drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("Firefox")) {
		 // System.setProperty("webdriver. firefox .driver","drivers//firefoxdriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
	  else if (browser.equalsIgnoreCase("Edge")) {
		 // System.setProperty("webdriver. edge .driver","drivers//edgedriver.exe");
			driver = new EdgeDriver();
			
		  driver.manage().window().maximize();
	  }
	}
	catch (WebDriverException e) {
		 System.out.println(e.getMessage());
  }
	
}
@Test	
	public void  sandhya () throws InterruptedException {
	
	
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Sandhya"+Keys.ENTER);
	Thread.sleep(5000);
}
@Test	
public void  jaalaja () throws InterruptedException {

driver.get("https://www.google.com");
Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys("Jalaja"+Keys.ENTER);
Thread.sleep(5000);
}

@Test	
public void  hema () throws InterruptedException {

driver.get("https://www.google.com");
Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys("Hema"+Keys.ENTER);
Thread.sleep(5000);
}
}