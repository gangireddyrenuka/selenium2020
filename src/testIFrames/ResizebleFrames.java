package testIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import navigationcommands.NavigationTest;

public class ResizebleFrames {

	public static void main(String[] args) {
		WebDriver d=NavigationTest.BrowserConf();
		d.get("https://jqueryui.com/");
	WebElement reSizeble=d.findElement(By.xpath("//a[text()='Resizable']"));
	reSizeble.click();
	
	WebElement iFrameElement=d.findElement(By.xpath("//iframe[@class='demo-frame']"));
	d.switchTo().frame(iFrameElement);
	
	WebElement resizeElement=d.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
	  //WebElement resizebt=d.findElement(By.xpath("//div[@id='slider']/span"));
	Actions act=new Actions(d);
	act.clickAndHold(resizeElement).moveByOffset(200, 100).build().perform();
	d.navigate().back();
	WebElement drop=d.findElement(By.xpath("//a[(text()='Droppable')]"));
	drop.click();
	d.switchTo().frame(0);
	WebElement src=d.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement target=d.findElement(By.xpath("//div[@id='droppable']"));
	
	//Actions act1=new Actions(d);
	
	act.dragAndDrop(src, target).build().perform();

	}

}
