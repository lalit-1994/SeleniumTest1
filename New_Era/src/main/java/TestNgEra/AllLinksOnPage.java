package TestNgEra;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class AllLinksOnPage 
{
	
	@Test(priority=1)
	public void AgreeyaWebPage() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C://BeatBlip//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "http://www.agreeya.com";
		driver.get(url);
		
		Thread.sleep(5000);
		
		
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File img1 = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img1, new File("C:\\BeatBlip\\Demo\\Screenshots\\img1.png"));
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the webpage : "+allLinks.size());
		System.out.println("---------------------------------------------------------------");
		
		for(WebElement item:allLinks)
		{
			System.out.println("Output Link of Target WEbsite : "+item.getAttribute("href"));
			System.out.println("----------------------------------------------------------");
		}
		
		
		
		
		
		driver.quit();
		
	}

}
