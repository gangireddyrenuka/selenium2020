package handledAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import navigationcommands.NavigationTest;

public class AlertTask {

	public static void main(String[] args) {
		WebDriver d=NavigationTest.BrowserConf();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement signBtn=d.findElement(By.xpath("//input[@title='Sign in']"));
		
		if(signBtn.isDisplayed()&&signBtn.isEnabled()){
			signBtn.click();
			String title = "I am an alert box!";
			Alert a=d.switchTo().alert();
          String actualTitle = a.getText();
          if(actualTitle.equals(title)){
        	  a.accept();
          }
		}
		else{
			System.out.println("it is not enabled");
		}
	}

}
