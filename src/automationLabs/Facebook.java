package automationLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.gecko.Driver", "C:/Users/Kaushik/workspace/selenium 2020/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		 String title=driver.getTitle();
		 System.out.println(title);
		
		 String currenturl= driver.getCurrentUrl();
		 
		 System.out.println(currenturl);
		 WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
			
			if(link.isDisplayed())
			{
			String linkText = link.getText();
			
			System.out.println(linkText);
			}
			else {
				System.out.println("forgottent account link not displayed..");
			}
			
				
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("renuka");
	//fname.click();
	//fname
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("gangireddy");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9000906690");
		
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("devanshi");
		
	
		
		WebElement dd_day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(dd_day);
		s.selectByVisibleText("20");
		
		WebElement dd_month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(dd_month);
		s1.selectByIndex(7);
		WebElement dd_year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(dd_year);
		s2.selectByValue("1993");
		
		WebElement female_button=driver.findElement(By.xpath("//label[text()='Female']"));
		System.out.println(female_button.isDisplayed());
		System.out.println(female_button.isSelected());
		if(!female_button.isSelected())
		{
			female_button.click();
		}
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 Alert alert=driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		
		
	}

}
