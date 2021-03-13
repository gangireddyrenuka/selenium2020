package handledAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import navigationcommands.NavigationTest;

public class AlertTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d	=NavigationTest.BrowserConf();
		d.get("http://demo.automationtesting.in/Register.html");
		WebElement Alertmenu=d.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement Alertsubmenu=d.findElement(By.xpath("//a[text()='Alerts']"));
		Actions act=new Actions(d);
		act.moveToElement(Alertmenu).moveToElement(Alertsubmenu).click().build().perform();
		WebElement subAlert=d.findElement(By.xpath("//a[contains(text(), 'Alert with OK & Cancel' )]"));
		act.moveToElement(subAlert).click().build().perform();

	}

}
