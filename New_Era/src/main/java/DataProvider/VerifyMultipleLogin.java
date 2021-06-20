package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyMultipleLogin 
{
	WebDriver driver;
	
	
	@BeforeTest
	public void open_browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.get(url);
		Thread.sleep(3000);
	}
	
	
	
	@Test(dataProvider = "testdataforlogin")
	public void verify_login(String uname,String pass) throws InterruptedException
	{
		
		WebElement username= driver.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys(uname);
		
		WebElement password= driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys(pass);
		
		Thread.sleep(5000);	
	}
	
	@DataProvider(name="testdataforlogin")
	public Object[][] test_data()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="TestOne";
		data[0][1]="PassOne";
		
		data[1][0]="Test2222222222";
		data[1][1]="Pass2222222";
		
		data[2][0]="Username 3";
		data[2][1]="password 3";
		
		return data;
	}
	
	@AfterTest
	public void close_browser()
	{
		driver.quit();
	}

}
