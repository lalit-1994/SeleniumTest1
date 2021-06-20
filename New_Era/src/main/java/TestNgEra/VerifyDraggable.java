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

public class VerifyDraggable 
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
		String url = "https://jqueryui.com/draggable/";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		WebElement src = driver.findElement(By.xpath(".//*[@id='draggable']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, 300, 150).perform();
		Thread.sleep(2000);
		
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}

}
