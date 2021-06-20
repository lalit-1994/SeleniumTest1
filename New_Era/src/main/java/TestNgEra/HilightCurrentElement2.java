package TestNgEra;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.HighlightWebElement;
import Library.Screenshots;

public class HilightCurrentElement2 {

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
		
		// Create the  JavascriptExecutor object
		  JavascriptExecutor js=(JavascriptExecutor)driver; 
		  
		 // call the executeScript method
		  //js.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", dd);
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		HighlightWebElement.highlight_element(driver, username);
		username.sendKeys("angular");
		Screenshots.captureScreeShot(driver, "username");
		
		
		WebElement password =driver.findElement(By.xpath(".//*[@id='password']"));
		HighlightWebElement.highlight_element(driver, password);
		password.sendKeys("password");
		Screenshots.captureScreeShot(driver, "password");
		
		WebElement uname =driver.findElement(By.xpath(".//*[@id='formly_1_input_username_0']"));
		HighlightWebElement.highlight_element(driver, uname);
		uname.sendKeys("Test");
		Screenshots.captureScreeShot(driver, "uname");
		Thread.sleep(2000);


		driver.quit();
		
	}
	
}
