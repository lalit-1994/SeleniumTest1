package TestNgEra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxCheck
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.spicejet.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
	}

	@Test
	public void verifycheck() throws Exception
	{
		WebElement Familycheckbox = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		Familycheckbox.click();
		
		boolean status = Familycheckbox.isSelected();
		System.out.println(status);
		
		List<WebElement> all=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(all.size());
				
		
		
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
