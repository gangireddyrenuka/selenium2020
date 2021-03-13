package automationLabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.Chrome.Driver", "C:/Users//Kaushik//workspace//selenium 2020//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.popuptest.com/goodpopups.html");
		 String mainpagetitle=d.getTitle();
		 
		 System.out.println(d.getTitle());
		
		
		String mainpageurl=d.getCurrentUrl();
		System.out.println(d.getCurrentUrl());
		
	WebElement link=d.findElement(By.xpath("//a[text()='Good PopUp #1']"));
	Assert.assertTrue(link.isDisplayed(), "Good Pop # 1 link is not displayed");
    link.click();
    
   Set<String> whs= d.getWindowHandles();
   
    Iterator<String> itr =whs.iterator();
   
    String wh1= itr.next();
  
    String wh2= itr.next();
  
    d.switchTo().window(wh2);
    
    String subpagetitle=d.getTitle();
    
    System.out.println(d.getTitle());
   
   
	String subPageUrl = d.getCurrentUrl();
	System.out.println("sub page url is : " + subPageUrl);
	
	Thread.sleep(3000);
	
   
   
    
    
    
    
	}

}
