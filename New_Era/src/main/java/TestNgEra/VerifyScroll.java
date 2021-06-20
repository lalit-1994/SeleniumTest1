package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyScroll 
{
	
	WebDriver driver;
	
	@BeforeClass
	public void open_browser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "http://www.way2automation.com/protractor-angularjs-practice-website.html";
		driver.get(url);
		Thread.sleep(5000);
		
	}
	
	@Test
	public void verifyscroll() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	

}
