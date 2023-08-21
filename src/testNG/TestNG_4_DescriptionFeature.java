package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_DescriptionFeature {

	WebDriver driver;

	@Test(description="Downloads Documentation Projects",enabled=false) 

	public void RM_5() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a")).click();  
	}

	@Test(description="Support")
	public void RM_6() {
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a/span")).click();	  
	}		  
	@Test(description="Blog",priority=0)
	public void RM_7() {
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span")).click();	  

	}
	@Test(description="Blog 2023")
	public void RM_8 () {
		driver.findElement(By.xpath("//*[@id=\"m-blog2023\"]/span")).click();	  
	} 
	@Test(description="Search module")
	public void RM_9 () {
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/button/span[1]/span")).click();	  

		driver.findElement(By.xpath("//*[@id=\"docsearch-input\"]")).sendKeys("java");	
		driver.findElement(By.xpath("//*[@id=\"docsearch-input\"]")).sendKeys("Keys.ENTER");	



	}  
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Selenium.dev");

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
