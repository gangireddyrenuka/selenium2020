package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://jqueryui.com/slider/");
	      WebElement menu=driver.findElement(By.xpath("//a[text()='Contribute']"));
         Actions act=new Actions(driver);
         act.moveToElement(menu).click().build().perform();

	}

}
