package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//open Firefox browser


public class Assignment1A 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "c://BeatBlip//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.quit();
		
        
	}

}
