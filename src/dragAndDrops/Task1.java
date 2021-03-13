package dragAndDrops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import navigationcommands.NavigationTest;

public class Task1 {

	public static void main(String[] args) {
		WebDriver d=NavigationTest.BrowserConf();
		d.get("https://jqueryui.com/droppable/");
		  WebElement droppable =d.findElement(By.xpath("//a[text()='Droppable']"));
		droppable.click();
		d.switchTo().frame(0);
  WebElement src=d.findElement(By.xpath("//div[@id='draggable']"));
  WebElement target=d.findElement(By.xpath("//div[@id='droppable']"));
  Actions act=new Actions(d);
  act.dragAndDrop(src, target).build().perform();
  d.switchTo().defaultContent();
  WebElement slider=d.findElement(By.xpath("//a[text()='Slider']"));
  slider.click();
  WebElement iframeElement=d.findElement(By.xpath("//iframe[@class='demo-frame']"));
  d.switchTo().frame(iframeElement);
  WebElement bt=d.findElement(By.xpath("//div[@id='slider']/span"));
  act.clickAndHold(bt).moveByOffset(100, 0).build().perform();
  
  


	}

	}


