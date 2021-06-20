package Miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPCertifications 
{
	static WebDriver driver;
	
	public static void main(String args[])
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		//Way 1
		ch.acceptInsecureCerts();
		
		//Way 2
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		//Way 3
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.get("http://www.google.com");
	
		
		
		driver.quit();
	}
}
