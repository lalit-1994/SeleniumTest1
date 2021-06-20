package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Print all links of a web page.

public class Exercise_4 
{
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "http://www.agreeya.com";
		
		driver.get(url);
		Thread.sleep(5000);
		
		//Take the screenshot
		TakesScreenshot ts =((TakesScreenshot)driver);
		File Screenshot1 = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(Screenshot1, new File("C:\\BeatBlip\\Demo\\Screenshots\\one.png"));
	
		
		
		
		List<WebElement> AllLinks =   driver.findElements(By.tagName("a"));
		
		System.out.println("total number of links : "+AllLinks.size());
		
		for(WebElement item:AllLinks)
		{
			System.out.println("Output is : "+ item.getAttribute("href"));
			System.out.println("----------------------------------------");
		}
		
		
		
		
		
		
		driver.quit();
	}

}
