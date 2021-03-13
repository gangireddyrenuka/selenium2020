package automationLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "C:/Users/Kaushik/workspace/selenium 2020/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		// Thread.sleep(3000);
		driver.get("www.google.com");
		

	}

}
