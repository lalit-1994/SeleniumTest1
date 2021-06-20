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

public class VerifyDragandDrop 
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
		String url = "https://dhtmlx.com/docs/products/dhtmlxTree/";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		
		WebElement sourcelocator = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement destinationlocator = driver.findElement(By.xpath("//*[@id='treeTarget']/ul"));
		
		Actions act = new Actions(driver);
		
		/*
		act.clickAndHold(sourcelocator)
		.moveToElement(destinationlocator)
		.release()
		.build()
		.perform();
		*/
		
		
		act.dragAndDrop(sourcelocator, destinationlocator).perform();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}


}
