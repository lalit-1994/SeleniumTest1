package AutoIt;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Library.BrowserFactory;

public class VerifyWindowsCredentials {
	
	WebDriver driver;
	
	
	@Test
	public void enterCredentials() throws InterruptedException, Exception
	{
		BrowserFactory.launchBrowser("chrome", "https://zoomin.agreeya.net/");
		 Thread.sleep(3000);
		 
		 Runtime.getRuntime().exec("E:\\123\\win.exe");
		 Thread.sleep(3000);
		
	}

}
