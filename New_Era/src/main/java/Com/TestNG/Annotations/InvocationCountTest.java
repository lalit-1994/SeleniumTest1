package Com.TestNG.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Test(invocationCount = 3)
	public void verifylogin() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("angular");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("Test");
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	
	
}
