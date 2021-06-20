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

public class VerifyContextClick 
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
		String url = "http://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement rightClick_btn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick_btn).perform();
		
		
		WebElement edit_btn = driver.findElement(By.xpath(".//*[@id='authentication']/ul/li[1]"));
		edit_btn.click();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}

}
