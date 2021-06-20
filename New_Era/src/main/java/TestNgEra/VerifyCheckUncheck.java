package TestNgEra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyCheckUncheck {
	
	WebDriver driver;	
	
	
	@Test
	public void verifycheck() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://beatblip.agreeya.net/BeatBlipUI/#/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='remember-me']"));
		checkbox.click();
		
		String o=checkbox.getAttribute("checked");
		System.out.println(o);
		
		Thread.sleep(5000);
		
		boolean output=checkbox.isSelected();
		
		System.out.println(output);
		
		driver.close();
		
	}

}
