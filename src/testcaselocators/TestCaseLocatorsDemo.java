package testcaselocators;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestCaseLocatorsDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
		
	}
@Disabled
 @Test
 void test1() throws InterruptedException {
 	driver.get("http://www.hyderabadreport.com/user");	
	driver.findElement(By.linkText("Photos")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Greater")).click();
	Thread.sleep(2000); 
}
@Disabled
 @Test
 void test2() throws InterruptedException {
   driver.get("http://www.hyderabadreport.com/user");
   Thread.sleep(2000);
   List<WebElement> totallinks = driver.findElements(By.tagName("a"));
   System.out.println(totallinks.size());
	System.out.println("Total links on hyderabadreport:"+totallinks.size());
      }

@Disabled
  @Test
  void test3() throws InterruptedException {

	driver.get("https://www.ndtv.com/user");
	Thread.sleep(2000);
	List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	System.out.println(totallinks.size());
	System.out.println("Total links on ndtv application:"+totallinks.size());
}


  @Test
 void test4() throws InterruptedException {
	driver.get("https://www.redmine.org/");
	Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/ul/li[1]/a")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("techlearn.in");
Thread.sleep(2000);	
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello123");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();	
Thread.sleep(2000);



	  }	
	
}
