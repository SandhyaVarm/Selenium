package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedLocator {
	
	WebDriver driver;
  @Test
  public void TakeScreenshot() throws InterruptedException, IOException {
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(5000);
	  
	WebElement res = driver.findElement(By.xpath("//*[@id=\"menu-394-1\"]/a"));
	  
	File f = res .getScreenshotAs(OutputType.FILE); 
	FileUtils.copyFile(f, new  File("C:\\screenshot\\VarmImageResume.png")); 
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	driver = new ChromeDriver();  
	 driver.manage().window().maximize();
	 
	 
	  
  }

}
