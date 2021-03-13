package automationLabs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.gecko.Driver", "C:/Users/Kaushik/workspace/selenium 2020/geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.xpath("//input[@title='Sign in']")).click();
		d.switchTo().alert();
		Alert art=	d.switchTo().alert();//alert class object...
         System.out.println(art.getText());
     
      String test=  art.getText();
      if(test.equals("Please enter a valid user name"))
      {
    	  System.out.println("correct alert messes");
      }
      else
      {
    	  System.out.println("incorrect alert messesge");                                                                                       
      }
      art.accept();
      //Thread.sleep(3000);
	}
	   

}
