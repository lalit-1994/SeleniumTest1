/**
 * 
 */
package Com.BeatBlip.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author lalit.yadav
 *
 *This page stores all the web elements and methods of login page
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") 
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement password;
	
	@FindBy(id = "search") 
	WebElement login_btn;
	
	@FindBy(linkText = "Forgot Password?") 
	WebElement forgot_password;
	
	public void login_BeatBlip(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		login_btn.click();
	}

}
