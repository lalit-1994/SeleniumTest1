/**
 * 
 */
package Com.BeatBlip.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Com.BeatBlip.Pages.HomePage;
import Com.BeatBlip.Pages.LoginPage;
import Library.BrowserFactory;

/**
 * @author lalit.yadav
 *
 *This test case is used to verify valid login into BeatBlip application
 */
public class VerifyValidLogin { 
	
	WebDriver driver;
	
	@Test
	public void loginToBeatBlip() throws Exception 
	{
		driver = BrowserFactory.launchBrowser("chrome", "http://beatblip.agreeya.net:7080/BeatBlipSubscriptionUI/#/login?redirect=true");
		LoginPage login_page= PageFactory.initElements(driver, LoginPage.class);//it will return the page object of same class
		login_page.login_BeatBlip("lalit.yadav@agreeya.com", "test@123");
		Thread.sleep(5000);
	}

	@Test
	public void verify_BB_version() throws Exception
	{
		//driver = BrowserFactory.launchBrowser("chrome", "http://beatblip.agreeya.net:7080/BeatBlipSubscriptionUI/#/login?redirect=true");
		HomePage hpage= PageFactory.initElements(driver, HomePage.class);
		String current_BB_version=hpage.verifyBBVersion();
		Assert.assertEquals(current_BB_version, "BeatBlip 3.1.1");
		Thread.sleep(5000);
	}
	
	
}
