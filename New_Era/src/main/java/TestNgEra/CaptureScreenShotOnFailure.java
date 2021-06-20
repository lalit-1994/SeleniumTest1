package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.HighlightWebElement;
import Library.Screenshots;

public class CaptureScreenShotOnFailure {

	WebDriver driver;
	
	@Test
	public void verifylogin() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.get(url);
		Thread.sleep(10000);
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		HighlightWebElement.highlight_element(driver, username);
		username.sendKeys("angular");
		
		
		WebElement password =driver.findElement(By.xpath(".//*[@id='password']"));
		HighlightWebElement.highlight_element(driver, password);
		password.sendKeys("password");
		
		
		WebElement uname =driver.findElement(By.xpath(".//*[@id='formly_1_input_username_0111']"));
		HighlightWebElement.highlight_element(driver, uname);
		uname.sendKeys("Test");
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void ScreenShotOnFailure(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshots.captureScreeShot(driver,result.getName());
			
		}
		
	}
	
	
}
