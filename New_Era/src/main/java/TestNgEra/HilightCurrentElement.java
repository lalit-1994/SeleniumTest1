package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HilightCurrentElement {

	WebDriver driver;
	
	@Test
	public void verifylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url="http://www.way2automation.com/angularjs-protractor/registeration/#/login";
		driver.get(url);
		Thread.sleep(3000);
		 
		// Create the  JavascriptExecutor object
		  JavascriptExecutor js=(JavascriptExecutor)driver; 
		  
		 // call the executeScript method
		  //js.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", dd);
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", username);
		username.sendKeys("angular");
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", username); 
		
		
		WebElement password =driver.findElement(By.xpath(".//*[@id='password']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", password);
		password.sendKeys("password");
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", password); 
		
		WebElement uname =driver.findElement(By.xpath(".//*[@id='formly_1_input_username_0']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uname);
		uname.sendKeys("Test");
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", uname);
		Thread.sleep(3000);

		driver.quit();
		
	}
	
}
