package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;

	public static WebDriver launchBrowser(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		
		
		return driver;
		
	}
	
}
