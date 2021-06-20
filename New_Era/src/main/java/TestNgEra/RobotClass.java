package TestNgEra;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass {
	
WebDriver driver;
	
	@Test
	public void checkKeyBoardAction() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "c://BeatBlip//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://the-internet.herokuapp.com/key_presses?";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//WebElement target=driver.findElement(By.xpath("//input[@id='target']"));
		WebElement result=driver.findElement(By.xpath("//p[@id='result']"));

       
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		
        
        String output=result.getText();
        String expectedoutput="You entered: ALT";
        if(output.equals(expectedoutput))
        {
        	System.out.println("Test Case Pass");
        }
        else
        {
        	System.out.println("Test Case Fail");
        }
		
		driver.close();
		
	}
	

}
