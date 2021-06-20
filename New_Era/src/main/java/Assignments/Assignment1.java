package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//open Chrome browser


public class Assignment1 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.quit();
		
        
	}

}
