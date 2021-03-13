package handledAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import navigationcommands.NavigationTest;

public class AlertAction {

	public static void main(String[] args) {
	WebDriver d	=NavigationTest.BrowserConf();
d.get("http://demo.automationtesting.in/Register.html");
WebElement Alertmenu=d.findElement(By.xpath("//a[text()='SwitchTo']"));
WebElement Alertsubmenu=d.findElement(By.xpath("//a[text()='Alerts']"));
Actions act=new Actions(d);
act.moveToElement(Alertmenu).moveToElement(Alertsubmenu).click().build().perform();
WebElement btn=d.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
WebElement AlertOkBtn=d.findElement(By.xpath("//a[@href='#OKTab']"));
AlertOkBtn.click();

if(btn.isDisplayed()&&btn.isEnabled()){
	btn.click();
	String title="i am alret box";
	Alert a=d.switchTo().alert();
	String actualTitle=a.getText();
	if(actualTitle.equals(title)){
		a.accept();
	}
	else{
		System.out.println("Button not displayed or enabled");
	}
	
}
	}

}
