package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
