package Com.TestNG.Annotations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelUtility;

public class DataProviderDemo2 {

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
	
	
	@DataProvider(name="testdatausingExcel")
	public String [][] getdata() throws IOException
	{
		String path="E:\\Sample Data\\TestSheet.xlsx";
		ExcelUtility ExcelData = new ExcelUtility(path);
		
		int totalRows=ExcelData.getRowCount("Sheet1");
		int totalColumn=ExcelData.getColumnCount("Sheet1", 1);
		
		String [][] logindata = new String[totalRows][totalColumn];
	    
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalColumn;j++)
			{
				logindata[i-1][j]=ExcelData.getCellData("Sheet1", i, j);
			}
		}
		
		return logindata;
	}
	
	
	@Test(dataProvider = "testdatausingExcel")
	public void VerifyUserCredentials(String name, String pass, String uname) throws InterruptedException
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys(name);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(pass);
		
		WebElement uname1 = driver.findElement(By.xpath("//*[@id=\"formly_1_input_username_0\"]"));
		uname1.sendKeys(uname);
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
