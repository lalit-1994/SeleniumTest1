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

public class VerifyScrollIntoView 
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
		String url = "http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyContextCLick() throws InterruptedException
	{
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		
		// Extract the text and verify

		System.out.println(element.getText());

	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}

}
