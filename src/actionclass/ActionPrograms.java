package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionPrograms {
	WebDriver driver;
  @Test(enabled=false)
  public void rightclick() throws InterruptedException {
	  
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-390-1\"]/a"))).build().perform();
	  
  }
	  
	  @Test(enabled=false)
	  public void doubledclickk() throws InterruptedException {
		  
		  driver.get("http://www.seleniumlearn.com/double-click");
		  Thread.sleep(5000);
		  
		  Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	  }
	  @Test
	  public void draganddrop() throws InterruptedException {
		  
		  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		  Thread.sleep(4000);
		  Actions act = new Actions(driver);
		   WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		   WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));	  
		  act. dragAndDrop(source,target).build().perform();
		  
	  }
		
		@Test(enabled=false)
public void mousehover() throws InterruptedException {
	  
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(4000);
	  Actions act =new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a/span"))).build().perform();
	 Thread.sleep(4000);
	 act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().build().perform();
} 
	 
	 @Test(enabled=false)
	  public void Keyboardfunction() throws InterruptedException {
		  
		  driver.get("https://www.redmine.org/login");
		  Thread.sleep(5000);
	//	  Actions act = new Actions(driver);
	//	  act. sendKeys(Keys.ENTER).build().perform();
		  
		 driver.findElement(By.id("login-submit")).submit();
				  
		  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
