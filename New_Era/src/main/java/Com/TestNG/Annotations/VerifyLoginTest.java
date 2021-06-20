package Com.TestNG.Annotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginTest {
	
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup() 
	{
		System.out.println("priority one");
		
	}
	
	@BeforeTest
	public void testsetup()
	{
		System.out.println("priority two");
	}
	
	@BeforeClass
	public void classsetup()
	{
		System.out.println("priority three");
	}
	
	@BeforeMethod
	public void Methodsetup()
	{
		System.out.println("priority four");
	}
	
	
	@Test(priority=1)
	public void verifylogin1()
	{
		System.out.println("Actual Test 1");
		
	}
	
	@Test(priority=2)
	public void verifylogin2()
	{
		System.out.println("Actual Test 2");
		
	}

	
	@AfterMethod
	public void Aftersetup()
	{
		System.out.println("priority five");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("priority six");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("priority seven");
	}
	
	@AfterSuite
	public void AfterS()
	{
		System.out.println("priority eight");
	}
}
