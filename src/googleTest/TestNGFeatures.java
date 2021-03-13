package googleTest;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test()
	public void loginPage()
	{
		System.out.println("homepage");
//		int i=10;
//		int j=0;
//		int k=i/j;
	}
	@Test(dependsOnMethods="loginPage")
	public void homePage()
	{
		System.out.println("homepage");
	}
	
	@Test(dependsOnMethods="loginPage")
	public void searchPage()
	{
		System.out.println("homepage");
	}
	

}
