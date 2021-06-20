package PropertyFileDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.ConfigReader;

public class LaunchBrowserUsingPropertyFile 
{
	@Test
	public void LaunchChromeBrowser() throws Exception
	{
		ConfigReader con = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", con.getchromePath());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(con.getApplicationURL());
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
