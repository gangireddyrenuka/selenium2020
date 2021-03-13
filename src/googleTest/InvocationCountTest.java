package googleTest;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	
	
	@Test(invocationCount=10)
	public void testCount()
	{
		
		int i=30;
		int j=10;
		int k=i/j;
		System.out.println("sum is=="+k);
	}

}
