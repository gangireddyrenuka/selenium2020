package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDemo {
@Test	
public void TC_001(){
	System.out.println("This is testcase_001");
	Assert.assertTrue(false);
	}
@Test(dependsOnMethods="TC_001")
public void TC_002(){
	System.out.println("This is testcase_002");
}
@Test
public void TC_004(){
	System.out.println("This is testcase_002");
}
}
