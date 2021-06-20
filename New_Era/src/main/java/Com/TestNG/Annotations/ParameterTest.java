package Com.TestNG.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class ParameterTest {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters({"url"})
	public void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	
	
	@Test()
	@Parameters({"username","password"})
	public void verifylogin(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("Test");
		Thread.sleep(5000);
		
		  
		 
		
		
	
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	
	
}
