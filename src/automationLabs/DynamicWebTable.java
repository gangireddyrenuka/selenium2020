package automationLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "C:/Users/Kaushik/workspace/selenium 2020/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewJobVacancy");
		
          WebElement addbtn=  driver.findElement(By.xpath("//input[@id='btnAdd']"));
          addbtn.click();
          
        String gettitle=  driver.getTitle();
        System.out.println(gettitle);
        
	}

}