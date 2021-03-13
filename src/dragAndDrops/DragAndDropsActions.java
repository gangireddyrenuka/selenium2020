package dragAndDrops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropsActions {
		//System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver d1=new ChromeDriver();
	    //  d1.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	      //WebElement src=d1.findElement(By.xpath("//div[@id='box1']"));
	     // WebElement target=d1.findElement(By.xpath("//div[@id='dropBox']"));
	      WebElement sc1=d1.findElement(By.xpath("//div[@id='box6']"));
	      WebElement target1=d1.findElement(By.xpath("//div[text()='South Korea']"));
Actions act=new Actions(d1);
//act.dragAndDrop(src, target);
//act.dragAndDrop(sc1, target1).build().perform();
	

}
