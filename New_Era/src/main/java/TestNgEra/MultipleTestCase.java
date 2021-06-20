package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleTestCase 
{
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser Started");
	}
	
	@Test(priority=1,description = "This test case will verify login functionlity")
	public void LoginToBeatBlip() throws Exception 
	{
		System.out.println("We are logging into BeatBlip web app");
		
		String url = "https://beatblip.agreeya.net/BeatBlipUI/";
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("lalit.yadav@agreeya.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("test@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginbtn.click();
		Thread.sleep(7000);	
		
		
	}
	
	@Test(priority=2,description = "This test case will verify welcome message",dependsOnMethods = "LoginToBeatBlip")
	public void VerifyHomePage() 
	{
		System.out.println("We are verifying home page");
		
		WebElement WelcomeMessage = driver.findElement(By.xpath("(//*[contains(text(),'Welcome')])[2]"));
		boolean output = WelcomeMessage.isDisplayed();
		
		System.out.println("Status of verification  : "+output);
	}
	
	@Test(priority=3,description = "This test case will verify logout functionility",dependsOnMethods = "LoginToBeatBlip")
	public void LogoutFromBeatBlip() throws Exception   
	{
		System.out.println("We are logging out from BeatBlip web app");
		
		WebElement usericon = driver.findElement(By.xpath("//span[text()='Hello Lalit!']"));
		usericon.click();
		
		WebElement logoutbtn = driver.findElement(By.xpath("//*[text()='Logout']"));
		logoutbtn.click();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("userName"));
		boolean finalstaus = username.isDisplayed();
		
		System.out.println("Final status of test case  : "+finalstaus);
		
		
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
		System.out.println("Browser Closed");
	}

}
