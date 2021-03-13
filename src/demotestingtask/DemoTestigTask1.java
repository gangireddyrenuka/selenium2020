package demotestingtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testbasepage.TestBase;
@Test
public class DemoTestigTask1 extends TestBase {
	public void RegisterPage()
	{
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.click();
	firstName.sendKeys("Devanshi");
	 WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	 lastName.click();
	 lastName.sendKeys("Bogala");
	 
	}

}
