package screenshothandle;

	
	import java.io.File;
//import java.nio.file.Files;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	//import com.google.common.io.Files;

	public class ScreenShotHandle {
	   // private static final String FileUtils = null;
		static WebDriver driver;
		public static void main(String[] args) {
			
			 System.setProperty("webdriver.chrome.driver","C:/Users/Kaushik/seleniumproject/WebDrivers/chromedriver.exe");
	         driver=new ChromeDriver();
			driver.get("www.facebook.com");
			takeScreenShot("facebook_login page");
			

		}

		public static void takeScreenShot(String filename)
		
		{
			//1.take screenshot and stoe in file format
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//2.now copy the screenshot to desired location using copy file method
			
			//FileUtils.copyFile(file,new File("C:/Users/Kaushik/seleniumproject/src/main/java/screenshot/"+filename+".jpg"));
			//

}
}