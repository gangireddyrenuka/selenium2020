package perfomencepagetestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageSir {
public WebDriver driver;
	
	@BeforeClass
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaushik\\workspace\\selenium 2020\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
		Assert.assertTrue(userName.isDisplayed(), "UserName Input field not displayed");
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
		Assert.assertTrue(password.isDisplayed(), "Password input box not displayed");
		password.sendKeys("admin123");

		WebElement LoginBtn = driver.findElement(By.xpath("//input[@value=\"LOGIN\"]"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
	
	@Test
	public void logout()
	{
		WebElement welcomeAdmin = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		Assert.assertTrue(welcomeAdmin.isDisplayed());
		welcomeAdmin.click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Actions act = new Actions(driver);
		act.moveToElement(logout).click().build().perform();
	}
	
	@Test
	public void verifyDashBoardPage()
	{
		WebElement dashboardTitle = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
		String expectedTitle = "Dashboard";
		String actualTitle = dashboardTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Page not loaded..");
		
		
	}
	
	@Test
	public void verifyLeaveList()
	{
		//WebElement leaveListModule = driver.findElement(By.xpath("//span[text()='Leave List']"));
		//Assert.assertTrue(leaveListModule.isDisplayed());
	}
	@Test
	public void performancepage() throws InterruptedException
	{
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/performance/searchKpi");
		
		WebElement perfomenceTitle = driver.findElement(By.xpath("//b[text()='Performance']"));
		Actions act=new Actions(driver);
		act.moveToElement(perfomenceTitle).click().build().perform();
		
		WebElement perfomenceTrcker = driver.findElement(By.xpath("//h1[text()='Performance Trackers']"));
		String expectedTitle1 = " perfomenceTrcker";
		String actualTitle1 = perfomenceTitle.getText();
		Assert.assertEquals(actualTitle1, expectedTitle1," perfomenceTrcker page is not displayed");
		
		WebElement configure = driver.findElement(By.xpath("//a[text()='Configure']"));
        act.moveToElement(configure).click().build().perform();
		
		WebElement kpi= driver.findElement(By.xpath("//a[text()='KPIs']"));
		WebElement perfomenceindi=driver.findElement(By.xpath("//a[@class='toggle tiptip']"));
		String expectedTitle2="Search Key Pefomence Indicator";
		String actualTitle2=perfomenceindi.getText();
		act.moveToElement(kpi).click().build().perform();
		
		
		WebElement kpisubmenu = driver.findElement(By.xpath("//a[@id='menu_performance_searchKpi']"));
		act.moveToElement(kpisubmenu).click().build().perform();
		Thread.sleep(5000);
		WebElement manageReviews=driver.findElement(By.xpath("//a[@id='menu_performance_ManageReviews']"));
		act.moveToElement(manageReviews).click().build().perform();
		
		
		
	}

}



