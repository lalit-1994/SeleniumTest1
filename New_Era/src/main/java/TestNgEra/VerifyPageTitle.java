package TestNgEra;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyPageTitle 
{
	
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	@Test(priority = 1)
	public void VerifyPageTitle()
	{
		
		String url = "http://www.agreeya.com";
		driver.get(url);
		
		String my_title=driver.getTitle();
		String expected_title = "AgreeYa Solutions - Software | Solutions | Services";
		
		Assert.assertEquals(my_title, expected_title);
		System.out.println("Test case Pass");
		
		Assert.assertTrue(my_title.contains("AgreeYa"));
		System.out.println("Test case Pass");
		
	}
	
	@Test(priority = 2)
	public void takesScreenShot() throws Exception  
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File imgA1 = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(imgA1, new File("C:\\BeatBlip\\Demo\\Screenshots\\imgA1.png"));
		
		
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}
	
	
	
	
	

}
