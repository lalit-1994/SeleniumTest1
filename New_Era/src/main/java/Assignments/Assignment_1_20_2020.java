package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment_1_20_2020 
{
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		Thread.sleep(2000);
	}
	
	@Test
	public void buyproduct() throws Exception 
	{
		WebElement signinbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signinbtn.click();
		     
		WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
		username.sendKeys("testone@yopmail.com");
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='passwd']"));
		password.sendKeys("test@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		loginbtn.click();
		Thread.sleep(2000);
		
		WebElement womenlink = driver.findElement(By.xpath("//a[@title='Women']"));
		womenlink.click();
		
		
		WebElement topslink = driver.findElement(By.xpath("//*[contains(text(),'Subcategories')]//following::a[1]"));
		topslink.click();
		
		
		
		WebElement blouselink = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[1]/div"));
		blouselink.click();
		
		
		WebElement quantityplusicon = driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span"));
		quantityplusicon.click();
		
		WebElement sizedropdown= driver.findElement(By.xpath(".//*[@id='group_1']"));
		Select oselect = new Select(sizedropdown);
		oselect.selectByValue("3");
		
		WebElement whitecolor = driver.findElement(By.xpath(".//*[@id='color_8']"));
		whitecolor.click();
		
		WebElement blackcolor = driver.findElement(By.xpath(".//*[@id='color_11']"));
		blackcolor.click();
		
		WebElement addtocart = driver.findElement(By.xpath(".//*[@id='add_to_cart']/button"));
		addtocart.click();
		
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		proceedtocheckout.click();
		
		Thread.sleep(2000);
		proceedtocheckout.click();
		
		Thread.sleep(2000);
		proceedtocheckout.click();
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
