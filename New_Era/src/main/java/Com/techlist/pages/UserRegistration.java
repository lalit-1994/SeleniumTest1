/**
 * 
 */
package Com.techlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Library.HighlightWebElement;

/**
 * @author lalit.yadav
 *
 *This class contains all the locators of user registration page
 */
public class UserRegistration {
	
	WebDriver driver;
	
	public UserRegistration(WebDriver ldriver) 
	{
		this.driver=ldriver;
		
	}

	@FindBy(xpath = "//a[@title='Log in to your customer account']") WebElement signin_button;
	@FindBy(id="email_create") WebElement emailaddress_txtbox;
	@FindBy(id="SubmitCreate") WebElement CreateAccount_btn;
	@FindBy(id="id_gender1") WebElement gender_btn;
	@FindBy(id="customer_firstname") WebElement firstname_txtbox;
	@FindBy(id="customer_lastname") WebElement lastname_txtbox;
	@FindBy(id="passwd") WebElement password_txtbox;
	@FindBy(id="days") WebElement days_drpdwn;
	@FindBy(id="months") WebElement month_drpdwn;
	@FindBy(id="years") WebElement year_drpdwn;
	@FindBy(id="company") WebElement company_txtbox;
	@FindBy(id="address1") WebElement address_txtbox;
	@FindBy(id="city") WebElement city_txtbox;
	@FindBy(id="id_state") WebElement state_drpdwn;
	@FindBy(id="postcode") WebElement postalcode_txtbox;
	@FindBy(id="id_country") WebElement country_drpdwn;
	@FindBy(id="phone_mobile") WebElement mobile_txtbox;
	@FindBy(id="submitAccount") WebElement register_btn;
	@FindBy(xpath = "//a[@title='View my customer account']") WebElement customer_name;
	
	public String user_registration()
	{
		HighlightWebElement.highlight_element(driver, signin_button);
		signin_button.click();
		emailaddress_txtbox.sendKeys("testuser1234@yopmail.com");
		CreateAccount_btn.click();
		gender_btn.click();
		firstname_txtbox.sendKeys("Test");
		lastname_txtbox.sendKeys("User");
		password_txtbox.sendKeys("test@123");
		
		Select oselect1 = new Select(days_drpdwn);
		oselect1.selectByValue("10");	
				
		Select oselect2 = new Select(month_drpdwn);
		oselect2.selectByValue("7");
		
		Select oselect3 = new Select(year_drpdwn);
		oselect3.selectByValue("1995");
		
		company_txtbox.sendKeys("Agreeya");
		address_txtbox.sendKeys("231-sector 57 , noida");
		city_txtbox.sendKeys("Folsom");
		
		Select oselect4 = new Select(state_drpdwn);
		oselect4.selectByValue("47");
		
		postalcode_txtbox.sendKeys("12345");
		
		Select oselect5 = new Select(country_drpdwn);
		oselect5.selectByValue("21");
		
		mobile_txtbox.sendKeys("0987654321");
		register_btn.click();
		
		String CustomerName=customer_name.getText();
		
		
		return CustomerName;
		
	}
	
	
}
