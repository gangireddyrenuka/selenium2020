package automationLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.Chrome.Driver", "C:/Users/Kaushik/workspace/selenium 2020/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://jqueryui.com/");
		
		d.findElement(By.xpath("//a[(text()='Resizable')]")).click();
		
       
		//WebElement frame=d.findElement(By.className("//iframe[@class='demo-frame']"));
		 d.switchTo().frame(0);
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
		d.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       WebElement src1= d.findElement(By.xpath("//div[@id='box3']"));
       
       WebElement target1=d.findElement(By.xpath("//div[@id='box103']"));
       
       act.dragAndDrop(src1, target1).build().perform();
       d.close();
	}

}
