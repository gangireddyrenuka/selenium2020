package windowHandle;
import java.util.Iterator;
import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
import org.testng.annotations.Test;

import testbasepage.TestBase;


public class WindowHandles extends TestBase {
	
		@Test
		public void testWindow() throws InterruptedException
		{
		
			driver.get("http://www.popuptest.com/goodpopups.html");
			
			String mainPageTitle = driver.getTitle();
			System.out.println(mainPageTitle);
			
			String mainPageUrl = driver.getCurrentUrl();
			System.out.println(mainPageUrl);
			Thread.sleep(3000);
			
			WebElement link =driver.findElement(By.xpath("//a[text()='Good PopUp #1']"));
			Assert.assertTrue(link.isDisplayed(), "Good Pop # 1 link is not displayed");
			link.click();
					
			//String mainPageWindowHandle = driver.getWindowHandle();
			//System.out.println(mainPageWindowHandle);
			
			Set<String> whs = driver.getWindowHandles();
			
			Iterator<String> itr = whs.iterator();
			
			String wh1 = itr.next();
			String wh2 = itr.next();
			
			driver.switchTo().window(wh2);
			
			String subPageTitle = driver.getTitle();
			System.out.println("sub page title is  : " +subPageTitle);
			
			String subPageUrl = driver.getCurrentUrl();
			System.out.println("sub page url is : " + subPageUrl);
			
			Thread.sleep(3000);
			
		}
		
	}



