package googleTest;

import org.testng.annotations.Test;

public class ExceptionTimeOut {

	
	

	@Test(expectedExceptions=NumberFormatException.class)
	public void test1(){
		
		String x="100A";
		Integer.parseInt(x);
	}
}
