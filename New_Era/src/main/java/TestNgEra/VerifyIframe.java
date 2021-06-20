package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyIframe 
{
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "file:///C:/Users/lalit.yadav/Desktop/automation/Q%20and%20A/IframeSampleSite.html";
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		driver.switchTo().frame("IF1");
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("Test User");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF2");
		WebElement layer1 = driver.findElement(By.xpath(".//*[@id='Layer_1']"));
		layer1.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}

}
