package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
	
  @Test
  public void GoogleSearch() throws IOException {
	  driver.get("https://www.google.com/");
	try {  
	      driver.get("https://www.google.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.name("q")).sendKeys("Tiruparhi");
	      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	      driver.findElement(By.xpath("/html/body/div[7]/div/div[5]/div/div/div[1]/div[1]/div/div[1]/div/div/a[3]/div/span")).click();     
	      }
    catch (Exception e) {
	  errorScreenshot();     }
	
    }
  @Test
  public void errorScreenshot() throws IOException {
	 File f =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f, new File("C:\\screenshot\\BugScreenshot.png")); 
	  
	  
	  
  }
  


@BeforeTest
  public void beforeTest() {
	  
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize(); 
  }

}
