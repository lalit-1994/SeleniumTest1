/**
 * 
 */
package Com.BeatBlip.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author lalit.yadav
 *
 */
public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath = "//a[text()='Help']") 
	WebElement Help_Link;
	
	@FindBy(xpath ="//a[text()='About BeatBlip']")
	WebElement About_BB_Link;
	
	@FindBy(xpath ="//*[contains(text(),'BeatBlip 3')]")
	WebElement BB_Version;
	
	@FindBy(xpath ="//button[contains(text(),'Cancel')]")
	WebElement Cancel_button;
	
	public String verifyBBVersion()
	{
		Help_Link.click();
		About_BB_Link.click();
		String BB_Verion=BB_Version.getText();
		Cancel_button.click();
		
		return BB_Verion;
	}

}
