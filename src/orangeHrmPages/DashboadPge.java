package orangeHrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DashboadPge {
	public WebDriver driver;
	@BeforeClass
	public void setupBowser(){
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Kaushik\\workspace\\selenium 2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Test(groups={"smoke test"})
	public void Login(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Assert.assertTrue(userName.isDisplayed(),"userName input field is not displyed");
		userName.sendKeys("Admin");
		WebElement loginField=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Assert.assertTrue(loginField.isDisplayed(),"loginField input field is not displyed");
		loginField.sendKeys("admin123");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Assert.assertTrue(loginBtn.isEnabled());
		loginBtn.click();
	}
@Test(groups={"smoke test"})
	public void dashBoard(){
		WebElement dashBoradTitle=driver.findElement(By.xpath("//b[text()='Dashboard']"));
		String expectedTitle="Dashboard";
		String actualTitle=dashBoradTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "DashBoard page not loaded");
		
}
}
