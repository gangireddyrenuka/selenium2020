package navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
	public static WebDriver BrowserConf(){
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      return driver;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=BrowserConf();
		d.get("https://www.facebook.com/");
		String FbTitle =d.getTitle();
		System.out.println(FbTitle);
		d.navigate().to("https://www.flipkart.com/?gclid=Cj0KCQiAs67yBRC7ARIsAF49CdWrGAlGU1YnpEeBa03L-kSX1owYUscu5pwgx9RQDNi7CZiZD4LKYLEaAoIGEALw_wcB&ef_id=Cj0KCQiAs67yBRC7ARIsAF49CdWrGAlGU1YnpEeBa03L-kSX1owYUscu5pwgx9RQDNi7CZiZD4LKYLEaAoIGEALw_wcB:G:s&s_kwcid=AL!739!3!326505276435!e!!g!!www%2Fflipkart.com&semcmpid=sem_8024046704_brand_eta_goog");
String flipKartTitle=d.getTitle();
System.out.println(flipKartTitle);

Thread.sleep(3000);
d.navigate().back();

Thread.sleep(5000);
d.navigate().forward();

Thread.sleep(5000);
d.navigate().refresh();




}
}