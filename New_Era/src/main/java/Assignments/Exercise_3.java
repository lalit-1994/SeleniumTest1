package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//assignment url: https://qatechhub.com/selenium-assignment-3/

public class Exercise_3 
{
	
		String url = "https://flipkart.com";
		ChromeDriver driver;
		
		public  void invokeBrowser() 
		{
			System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
		}
		public void getLinkCount()
		{
			List<WebElement> AnchorLinks = driver.findElements(By.tagName("a"));
			int LinkSize = AnchorLinks.size();
			System.out.println("Number of links on the page is :: "+ LinkSize);
			
			
		}
		
		public void getAllLinkInfo()
		{
			List<WebElement>  allLinksInfo = driver.findElements(By.tagName("a"));
			
			for(WebElement link:allLinksInfo )
			{
				String 	LinkText = link.getText();
				String LinkURL = link.getAttribute("href");
				
				System.out.println("Link Text is :: "+LinkText);
				System.out.println("Link URL is :: "+LinkURL);
				
				
				
			}
			driver.quit();
		}
		
		public static void main(String args[]) 
		{
			Exercise_3 ex = new Exercise_3();
			ex.invokeBrowser();
			ex.getLinkCount();
			ex.getAllLinkInfo();
		}
		
		
		
		
		
		
		
	

}
