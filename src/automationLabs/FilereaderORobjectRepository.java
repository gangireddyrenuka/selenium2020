package automationLabs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FilereaderORobjectRepository {

	 static	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Properties prop=new Properties();
		
		
		FileInputStream ip=new FileInputStream("C:/Users//Kaushik//workspace//selenium 2020//src//config.properties");
		
		prop.load(ip);
		
		//prop.getProperty("name");
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
	    String url=	prop.getProperty("url");
		
		System.out.println(url);
		
		String brouse=prop.getProperty("brouser");
		
		System.out.println(brouse);
		
		
		if(brouse.equals("chrome"))
		{
			System.setProperty("WebDriver.Chrome.Driver", "C:/Users//Kaushik//workspace//selenium 2020//chromedriver.exe");
	         driver=new ChromeDriver();
		}
			
			else if(brouse.equals("FF"))	
			{
				System.setProperty("WebDriver.gecko.Driver", "C:/Users//Kaushik//workspace//selenium 2020//geckodriver.exe");
			driver=new FirefoxDriver();
			}
		
			else if(brouse.equals("InternetExplorer")) 
			{
				System.setProperty("WebDriver.gecko.Driver", "C:/Users//Kaushik//workspace//selenium 2020//geckodriver.exe");
		driver=new InternetExplorerDriver();
			}
	
		
	//hread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(prop.getProperty("f-name"))).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.xpath(prop.getProperty("l-name"))).sendKeys(prop.getProperty("lastname"));
		
		
		
		
		

	}

}
