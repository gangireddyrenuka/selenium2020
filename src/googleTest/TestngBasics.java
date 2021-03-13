package googleTest;

import org.testng.annotations.Test;

public class TestngBasics {
	
	
	
	
	@Test(priority=1,groups="login")
	public void loginPage()
	{
		System.out.println("loginpage");
	}
	@Test(priority=2,groups="home")
	public void homePage()
	{
		System.out.println("homepage");
	}
	
	@Test(priority=2,groups="home")
	public void searchPage()
	{
		System.out.println("homepage");
	}
	@Test(groups="Test")
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test(groups="Test")
	public void Test2()
	{
		System.out.println("test2");
	}
	@Test(groups="Test")
	public void Test3()
	{
		System.out.println("test3");
	}

}
