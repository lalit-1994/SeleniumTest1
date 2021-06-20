package TestNgEra;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void test()
	{
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);   //Hard Assert
		
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click on login button");
		Assert.assertEquals(true, true);    //Hard Assert
		
		System.out.println("Validate home page");
		softassert.assertEquals(true, false,"Valid title is not present"); //Soft Assert
		
		System.out.println("GO to contacts");
		System.out.println("Create contacts");
		softassert.assertEquals(true, false,"Missing details"); //Soft Assert
		
		
		softassert.assertAll();
		
		
	}
	
	
}
