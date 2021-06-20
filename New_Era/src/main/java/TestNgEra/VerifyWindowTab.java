package TestNgEra;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyWindowTab 
{
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		String url = "http://www.way2automation.com/protractor-angularjs-practice-website.html";
		driver.get(url);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void verifywindow() throws InterruptedException
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window id is : "+parentwindow);
		
		WebElement elementtoscroll = driver.findElement(By.xpath("//h2[text()='Registration']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elementtoscroll);
		Thread.sleep(3000);
		
		elementtoscroll.click();
		Thread.sleep(3000);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String child:allwindows)
		{
			if(!parentwindow.equals(child))
			{
				driver.switchTo().window(child);
				WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
				username.sendKeys("Test User");
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentwindow);
		
		WebElement multiform = driver.findElement(By.xpath("//h2[text()='Multi Form']")); 
		multiform.click();
		Thread.sleep(3000); 
		
		
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
