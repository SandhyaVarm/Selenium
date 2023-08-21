package sikulix;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	
	Screen s = new Screen();
	
  @Test
  public void desktop() throws FindFailed, InterruptedException {
	  
	//  s.click("C:\\sikulix\\WindowsButton.JPG");
	    Thread.sleep(4000);
	//  s.click("C:\\sikulix\\Symbol.JPG");
	    Thread.sleep(4000);
	// s.click("C:\\sikulix\\04August2023.JPG");
	  
	//  s.click("C:\\sikulix\\Symbolpoint.JPG");
	  
	 s.dragDrop("C:\\sikulix\\Resume.JPG","C:\\sikulix\\Sandhya.JPG");
  }
}
