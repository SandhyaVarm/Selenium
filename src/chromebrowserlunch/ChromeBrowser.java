package chromebrowserlunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(6000);
	//	driver.close();
		driver.quit();
		
		driver = new EdgeDriver();
		
		
		
	}

}
