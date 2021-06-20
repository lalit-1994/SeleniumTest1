package NewTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyLogin 
{
	WebDriver driver;

	@Parameters({"url"})
	@BeforeMethod
	public void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login"; 
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

	@Parameters({"username","password","usernameone"})
	@Test(enabled=true)
	public void verifyUserLogin(String user, String pass, String usernameone)
	{
		WebElement username =driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys(user);

		WebElement password =driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pass);

		WebElement username1 =driver.findElement(By.id("formly_1_input_username_0"));
		username1.clear();
		username1.sendKeys(usernameone);

		WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"formly_1_input_username_0\"]/following::button[1]"));
		loginButton.click();

		WebElement message = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/p[1]"));
		Wait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(message));

		String actual_message=message.getText();

		Assert.assertEquals(actual_message, "You're logged in!!");
		
		WebElement logoutLink= driver.findElement(By.xpath("//a[text()='Logout']"));
		logoutLink.click();
		driver.quit();
	}
	
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
