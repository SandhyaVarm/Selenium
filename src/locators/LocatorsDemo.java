package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		
	}
        @Test
		void test1() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/user");	
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("Sandhya");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("HELLO@123");
		Thread.sleep(2000);
	//	driver.findElement(By.className("form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.form-submit")).click();
		Thread.sleep(2000);
		
  }		
		
		
}
  
  
  
  
  
