package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyTestCase
{
	WebDriver driver;
	
	@Test
	public void verifyGooglePage()
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	
	@Test
	public void verifyMatch()
	{
		Assert.assertEquals(true, false);
		
	}


}
