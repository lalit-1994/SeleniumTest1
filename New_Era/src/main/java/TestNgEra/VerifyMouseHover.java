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

public class VerifyMouseHover 
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
		String url = "https://demoqa.com/menu/";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement mhover_option = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mhover_option).perform();
		
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}

}
