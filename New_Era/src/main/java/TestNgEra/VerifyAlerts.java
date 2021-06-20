package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyAlerts 
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
		String url = "https://demoqa.com/alerts";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		
		WebElement simplealert_btn = driver.findElement(By.xpath(".//*[@id='alertButton']"));
		WebElement confirmalert_btn = driver.findElement(By.xpath(".//*[@id='confirmButton']"));
		WebElement promptalert_btn = driver.findElement(By.xpath(".//*[@id='promtButton']"));
		//WebElement alerttimer_btn = driver.findElement(By.xpath(".//*[@id='timerAlertButton']"));
		
		simplealert_btn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		confirmalert_btn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		promptalert_btn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello User");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", simplealert_btn);
		String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Alert text content is : "+alerttext);
		Thread.sleep(2000);
		
		
		
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}


}
