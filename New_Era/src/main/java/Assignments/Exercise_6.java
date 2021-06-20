package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Exercise_6 
{
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="http://www.way2automation.com/protractor-angularjs-practice-website.html";
		driver.navigate().to(url);
		Thread.sleep(3000);
	}
	
	
	public void switchtochildwindow()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window id is : "+parentwindow);
	}
	
	
	
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}
