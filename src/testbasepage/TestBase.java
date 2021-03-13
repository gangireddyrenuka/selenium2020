package testbasepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static void Browseroption(String browser){
		switch(browser)
		{
		case "chrome":
			System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      driver=new ChromeDriver();
		      break;
		case"firefox":
			System.setProperty("Webdriver.gecko.Driver", "C:\\Users\\Kaushik\\workspace\\selenium 2020\\geckodriver.exe");
			 driver=new FirefoxDriver();
			default:System.out.println("no browae matctching u criteria");
		}
	}
		@BeforeSuite
		public void BrowserConfiguration()
		{
			Browseroption("chrome");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			
		}
		@AfterSuite
		public void closeBroserConfig()
		{
			driver.close();
		}
			
		}
		
	


