package Com.TestNG.Annotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ReadMultipleDataFromExcel2;

public class DataProviderTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@DataProvider(name="dataone")
	public Iterator<Object> getdata() throws IOException
	{
		ArrayList<Object> mytestdata=ReadMultipleDataFromExcel2.readdata();
		return mytestdata.iterator();
	}
	
	
	
	
	
	@Test(dataProvider = "dataone")
	public void VerifyUserCredentials(String name, String pass, String u1name)
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys(name);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(pass);
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"formly_1_input_username_0\"]"));
		uname.sendKeys(u1name);;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
