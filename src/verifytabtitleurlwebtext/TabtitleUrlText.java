
package verifytabtitleurlwebtext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabtitleUrlText {

	WebDriver driver;

	@Test(enabled=false)
	public void verifytabtitle() {
		driver.get("https://www.google.com");

		String s = "HELLO SANDHYA";
		System.out.println(s);

		String  exptabtext = "Google";
		String  acttabtext = driver.getTitle();
		Assert.assertEquals(acttabtext, exptabtext);
	}
	@Test(enabled=false)
	public void verifyurl() {
		driver.get("https://www.google.com");

		String expturl = "https://www.google.com/";

		String acturl  = driver.getCurrentUrl();
		Assert.assertEquals(acturl,expturl);

	}
	@Test
	public void verifytext() {
		driver.get("https://www.google.com");
	String eim = "Images";
	String aim = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();

	Assert.assertEquals(aim,eim);
	}
	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
