package TestNgEra;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

	
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://agreeya.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinksOnPage= allLinks.size();
		System.out.println("totoal number of links : "+totalLinksOnPage);
		
		for(WebElement item:allLinks)
		{
			String URL=item.getAttribute("href");
			//System.out.println(URL);
			//System.out.println("------------------------------------------------------");
			verifyActiveLink(URL);
		}
	
		driver.quit();
	}
	
	public static void verifyActiveLink(String linkurl) throws Exception {
		
		URL url1= new URL(linkurl);
		HttpURLConnection httpurlconnect=(HttpURLConnection)url1.openConnection();
		httpurlconnect.setConnectTimeout(3000);
		httpurlconnect.connect();
		
		if(httpurlconnect.getResponseCode()==200)
		{
			System.out.println(linkurl+"--"+httpurlconnect.getResponseMessage());
		}
		if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+"--"+httpurlconnect.getResponseMessage() +"--"+HttpURLConnection.HTTP_NOT_FOUND);
		}		
		
	}

}
