package googleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("https://www.google.com/");
	}
	
	@Test
	public void getTitle(){
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	@Test
	public void GamilTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("test2");
	}
	public void Test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
