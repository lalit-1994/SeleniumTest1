package Com.TestNG.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {

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
	
	
	@DataProvider(name="way2Data")
	public String[][] getdata()
	{
	    String [][]  data1 = new String[3][2];
	    data1[0][0]="one";
	    data1[0][1]="1";
	    
	    data1[1][0]="two";
	    data1[1][1]="2";
	    
	    data1[2][0]="three";
	    data1[2][1]="3";
	    
	    return data1;
		
	}
	
	
	
	
	
	
	@Test(dataProvider = "way2Data")
	public void VerifyUserCredentials(String name, String pass) throws InterruptedException
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys(name);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(pass);
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"formly_1_input_username_0\"]"));
		uname.sendKeys("Test");
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
