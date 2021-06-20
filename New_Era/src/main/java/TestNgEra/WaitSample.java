package TestNgEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitSample
{
	
	@Test
	public void VerifyWaitTimeout()
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html";
		driver.get(url);
		
		//Implicit wait and it is applied always after getting the url.
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement webdriver_label=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		
		boolean status=webdriver_label.isDisplayed();
		
		if(status==true)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
		
		/*
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
           */
		
		
		
		driver.quit();
	}

}
