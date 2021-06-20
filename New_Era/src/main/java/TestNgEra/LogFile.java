package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.HighlightWebElement;
import Library.Screenshots;

public class LogFile {
	
	WebDriver driver;
	
	
	@Test
	public void verifylogin() throws Exception {
		
		
		
		Logger log = Logger.getLogger("LogFile");
		PropertyConfigurator.configure("logfile.properties");
		
		
	
	System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	log.info("browser maximised");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
	driver.get(url);  
	log.info("url pened");
	Thread.sleep(10000);
	
	
	WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
	username.sendKeys("angular");
	Screenshots.captureScreeShot(driver, "username");
	
	
	WebElement password =driver.findElement(By.xpath(".//*[@id='password']"));
	password.sendKeys("password");
	Screenshots.captureScreeShot(driver, "password");
	
	WebElement uname =driver.findElement(By.xpath(".//*[@id='formly_1_input_username_0']"));
	uname.sendKeys("Test");
	Screenshots.captureScreeShot(driver, "uname");
	Thread.sleep(2000);


	driver.quit();
	}
}
