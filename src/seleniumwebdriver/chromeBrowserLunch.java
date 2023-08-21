package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class chromeBrowserLunch {
	 static WebDriver  driver;

	public static void main(String[] args) {
		driver  = new ChromeDriver(); 
		driver  = new FirefoxDriver();		
		driver  = new EdgeDriver();
		driver.quit();
		
		
		
		
		
	}

}
