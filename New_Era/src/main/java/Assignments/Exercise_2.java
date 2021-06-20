package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//assignment url: https://qatechhub.com/selenium-assignment-2/


public class Exercise_2 
{
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String url = "http://www.fb.com";
		driver.navigate().to(url);
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.facebook.com/";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("You have opened the correct page");
		}
		else
		{
			System.out.println("oopppsss.... you have opened incorrect page");
		}
		
		WebElement  CreateAccount_btn = driver.findElement(By.id("u_0_2"));
		boolean output = CreateAccount_btn.isDisplayed();
		
		System.out.println("Status of Create Account button is  : " +output);
		Thread.sleep(5000);
		CreateAccount_btn.click();
		Thread.sleep(5000);
		
		WebElement Fname_txtbox = driver.findElement(By.name("firstname"));
		Fname_txtbox.sendKeys("Lalit");
		
		WebElement Lname_txtbox = driver.findElement(By.name("lastname"));
		Lname_txtbox.sendKeys("Yadav");
		
		WebElement Mobile_txtbox = driver.findElement(By.name("reg_email__"));
		Mobile_txtbox.sendKeys("0987654321");
		
		WebElement Password_txtbox = driver.findElement(By.name("reg_passwd__"));
		Password_txtbox.sendKeys("test@123");
		
		WebElement Day_drpdwn = driver.findElement(By.name("birthday_day"));
		Select oselect = new Select(Day_drpdwn);
		oselect.selectByValue("26");
		
		WebElement Month_drpdwn = driver.findElement(By.name("birthday_month"));
		Select mselect = new Select(Month_drpdwn);
		mselect.selectByValue("10");
		
		WebElement Year_drpdwn = driver.findElement(By.name("birthday_year"));
		Select yselect = new Select(Year_drpdwn);
		yselect.selectByValue("1994");
		
		
		
		WebElement Gender_radiobtn = driver.findElement(By.xpath("//label[text()='Male']"));
		Gender_radiobtn.click();
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
