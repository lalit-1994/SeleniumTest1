/**
 * 
 */
package Com.techlist.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.techlist.pages.UserRegistration;
import Library.BrowserFactory;

/**
 * @author lalit.yadav
 *
 */
public class TechListTestCases {
	
	@Test
	public void verifyUserRegistration()
	{
		WebDriver driver=BrowserFactory.launchBrowser("ChromE", "http://automationpractice.com/index.php");
		UserRegistration user_reg_page =PageFactory.initElements(driver, UserRegistration.class);
		String Uname=user_reg_page.user_registration();
		try {
			Thread.sleep(7000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(Uname, "Test User");
		System.out.println("Test Case passed and loggedin username is "+Uname);
		driver.quit();
		
		
	}

}
