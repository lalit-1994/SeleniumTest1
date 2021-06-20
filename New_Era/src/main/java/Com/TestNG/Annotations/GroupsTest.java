package Com.TestNG.Annotations;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test(priority=2, groups = "Group One")
	public void test1()
	{
		System.out.println("this is test 1");
	}
	
	@Test(priority=1, groups = "Group One")
	public void test2()
	{
		System.out.println("this is test 2");
	}
	
	@Test(priority=3, groups = "Group two")
	public void test3()
	{
		System.out.println("this is test 3");
	}
	
	@Test(priority=4, groups = "Group two")
	public void test4()
	{
		System.out.println("this is test 4");
	}

	
}
