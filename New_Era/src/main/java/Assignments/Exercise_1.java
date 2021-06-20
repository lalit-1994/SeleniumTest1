package Assignments;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//assignment url https://qatechhub.com/selenium-assignment-1/


public class Exercise_1 
{
	public static void main(String args[]) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String url="http://qatechhub.com";
		
		driver.navigate().to(url);
		
		String ActualPageTitle = driver.getTitle();
		String ExpectedPageTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//FileHelper.copyFile(src, new File("E:\\adb\\abc.png"));
		
			
	
		
		
		if(ActualPageTitle.equals(ExpectedPageTitle))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().back();
		
		String PageURL = driver.getCurrentUrl();
		System.out.println("Current Page URL is : "+PageURL);
		
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		System.out.println("Test Case Pass");
		
		driver.quit();
	}

}
