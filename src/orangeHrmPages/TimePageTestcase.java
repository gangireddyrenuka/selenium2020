package orangeHrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimePageTestcase {
	public WebDriver driver;
	@BeforeClass
	public void setupBowser(){
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Kaushik\\workspace\\selenium 2020\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	@BeforeMethod
	public void Login(){
		driver.get("https://opensource-demo.orangehrmlive.com");
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
	@Test(priority=1)
	public void dashBoard(){
		WebElement dashBoradTitle=driver.findElement(By.xpath("//b[text()='Dashboard']"));
		String expectedTitle="Dashboard";
		String actualTitle=dashBoradTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "DashBoard page not loaded");
		}
	@Test(priority=2)
	public void timepage(){
		driver.navigate().to("");
		WebElement timepageTitle=driver.findElement(By.xpath("//b[text()='Time']"));
		Assert.assertTrue(timepageTitle.isDisplayed(),"timepageTitle is not loaded");
		timepageTitle.click();
		Actions act=new Actions(driver);
		act.moveToElement(timepageTitle).click().build().perform();
		
	}
	@Test(priority=2)
	public void timesheetTitle(){
		WebElement timesheetSubmenu=driver.findElement(By.xpath("//a[text()='Timesheets']"));
		WebElement employeeTimesheet=driver.findElement(By.xpath("//a[text()='Employee Timesheets']"));
		Actions act=new Actions(driver);
		act.moveToElement(timesheetSubmenu).moveToElement(employeeTimesheet).click().build().perform();
		
		}
	@AfterClass
	public void logout() throws InterruptedException{
		WebElement welcomeAdmin=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		Assert.assertTrue(welcomeAdmin.isDisplayed());
		welcomeAdmin.click();
		WebElement welcomelogout=driver.findElement(By.xpath("//a[text()='Logout']"));
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(welcomelogout).click().build().perform();
		}
	@Test
	public void closeBrowser()
	{
		driver.close();
	}
}
