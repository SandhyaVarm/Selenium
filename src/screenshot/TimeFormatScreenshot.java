package screenshot;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
	WebDriver driver;
	
  @Test
  public void TakeScreenshot() throws IOException {
	  
	  DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd hh_mm_ss");
	  Date date = new Date();
	  String time = dateFormat.format(date);
	 
	 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f, new File("C:\\screenshot\\Varm_"+ time +".Png" )); 
	  
	   }
  @Test
  public void google() throws InterruptedException, IOException  {
	  
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  TakeScreenshot();
	  driver.findElement(By.name("q")).sendKeys("Tirupathi"+Keys.ENTER);
	  Thread.sleep(2000);
	  TakeScreenshot();
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/a[3]/div")).click();
	  Thread.sleep(2000);
	  TakeScreenshot();

  }	  
 @BeforeTest
  public void beforeTest() {
	  
	 driver = new ChromeDriver() ;
	 driver.manage().window().maximize(); 
	  
  }

}
