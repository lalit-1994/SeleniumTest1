package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestParam 
{
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	@Parameters({"username","password"})
	public void verifyCredentials1(String username,String password) throws Exception
	{
		WebElement username_textbox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username_textbox.sendKeys(username);

		WebElement password_textbox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password_textbox.sendKeys(password);
		
		Thread.sleep(5000);

	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

	
}

