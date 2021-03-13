package flipkartTsk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import testbasepage.TestBase;

public class FlipkatTaskExample extends TestBase {
	@Test
	public void LoginPage() throws InterruptedException
	{
       driver.get("https://www.flipkart.com/");
       
       WebElement login=driver.findElement(By.xpath("//span[@class='s-YM1W']/preceding-sibling::input"));
       login.click();
       login.sendKeys("9000906690");
   
       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
       password.click();
       password.sendKeys("devanshi143");
   
       WebElement loginbtn=  driver.findElement(By.xpath("//button[@type='submit']/span[text()='Login']"));
       loginbtn.click();
       Thread.sleep(5000);
       //driver.switchTo().defaultContent();
       
       WebElement searchBtn=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	   searchBtn.click();
	   searchBtn.sendKeys("mobiles");
	   
	   WebElement seachBtn2=driver.findElement(By.xpath("//button[@type='submit']"));
	   seachBtn2.click();
	   WebElement redmi=driver.findElement(By.xpath("//div[text()='Realme 5i (Aqua Blue, 64 GB)']"));
	   redmi.click();
	   
	   WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
	   Actions act=new Actions(driver);
	   act.moveToElement(cart).click().build().perform();
	   
	   //driver.switchTo().frame("https://www.flipkart.com/realme-5i-aqua-blue-64-gb/p/itmdac0da867a9fa?pid=MOBFNG3GZXCV63BE&lid=LSTMOBFNG3GZXCV63BEMPJERT&marketplace=FLIPKART&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=ad0ebe92-aa33-4137-9f8d-91317385689c.MOBFNG3GZXCV63BE.SEARCH&ppt=sp&ppn=sp&ssid=4i40w84sk00000001582892115225&qH=eb4af0bf07c16429");
	  // WebElement cartBtn=driver.findElement(By.xpath("//button[(@class='_2AkmmA _2Npkh4 _2MWPVK')]"));
	   //Assert.assertTrue(cartBtn.isDisplayed(), "addcat button is not thare");
	   //cartBtn.click();
	   
      //driver.getWindowHandle("");
	}
  	   
       
	 }

