package TestNgEra;

import org.testng.annotations.Test;

public class PriorityCheck {

	@Test(priority=-1)
	public void login1()
	{
		System.out.println("test case 1");
	}
	
	
	@Test(priority=-2)
	public void login2()
	{
		System.out.println("test case 2");
	}
	
	
	@Test(priority=-4)
	public void login3()
	{
		System.out.println("test case 3");
	}
	
	
	@Test(priority=5)
	public void login4()
	{
		System.out.println("test case 4");
	}
	
	
	@Test(priority=1)
	public void login5()
	{
		System.out.println("test case 5");
	}
	
	
	@Test(priority=0)
	public void login6()
	{
		System.out.println("test case 6");
	}
	
}
