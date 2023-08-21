package alertpopups;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindowHandles {
	WebDriver driver;
	
  @Test(enabled=false)
  public void alertokbutton() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000); 
	  driver.switchTo().alert().accept();
	    }
  @Test(enabled=false)
  public void alertcancelbutton() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000); 
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void alertsendtextokbutton() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000);
	/*  driver.switchTo().alert().sendKeys("Sandhya");
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);*/
	  
	  Alert alt = driver.switchTo().alert();
	  alt. sendKeys("sandhya");
	  alt.accept();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
