package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownFeatures {
	
	WebDriver driver;
  @Test
  public void selectdropdown() throws InterruptedException {
	  
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("516101");
	  Thread.sleep(3000);
	// new  Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Australia");
	//  new  Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("DE");
	//  new  Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(7);
	  
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	 dropdown.selectByVisibleText("India");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
