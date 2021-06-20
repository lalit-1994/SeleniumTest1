package Library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinks {

	static WebDriver driver;
	
	public static void getPageLinks(String url)
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		int count = all_links.size();
		System.out.println("Total Links On Page: " +count);
		System.out.println("---------------------------------------------");     
		
		for(WebElement item:all_links)
		{
			System.out.println(item.getAttribute("href"));
		}
		driver.close();
		
	}
}
