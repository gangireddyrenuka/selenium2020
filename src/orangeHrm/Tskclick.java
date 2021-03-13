package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Tskclick {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/");
      WebElement userNameInputBox=driver.findElement(By.xpath("//input[@id='txtUsername']"));
      userNameInputBox.sendKeys("Admin");
     WebElement inputPassWordBox= driver.findElement(By.xpath("//input[@id='txtPassword']"));
      inputPassWordBox.sendKeys("admin123");
      WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      loginButton.click();
      WebElement admin=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
      admin.click();
      WebElement dashBoradTitle=driver.findElement(By.xpath("//b[text()='Dashboard']"));
		String expectedTitle="Dashboard";
		String actualTitle=dashBoradTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "DashBoard page not loaded");
		
		WebElement timetitle=driver.findElement(By.xpath("//b[text()='Time']"));
		Actions act=new Actions(driver);
		act.moveToElement(timetitle).click().build().perform();
		 WebElement timesheetSubmenu=driver.findElement(By.xpath("//a[text()='Timesheets']"));
		act.moveToElement(timesheetSubmenu).click().build().perform();
		WebElement employeeTimesheet=driver.findElement(By.xpath("//a[text()='Employee Timesheets']"));
		act.moveToElement(employeeTimesheet).click().build().perform();
		WebElement selectemployee=driver.findElement(By.xpath("//h1[text()='Select Employee']"));
		String expectedTitle1="Select Employee";
		String actualTitle1=selectemployee.getText();
		Assert.assertTrue(selectemployee.isDisplayed(), "selectemployee page is not there");
		WebElement attendenceTitle=driver.findElement(By.xpath("//a[text()='Attendance']"));
		act.moveToElement(attendenceTitle).click().build().perform();
		WebElement employerecods=driver.findElement(By.xpath("//a[@id='menu_attendance_viewAttendanceRecord']"));
		 WebElement employeeAttendence=driver.findElement(By.xpath("//h1[text()='View Attendance Record']"));
         String expectedemployeeAttendence="employeeAttendence";
        String actualemployeeAttendence=employeeAttendence.getText();
        Assert.assertTrue(employeeAttendence.isDisplayed(),"employerecodspage is not loaded");
        act.moveToElement(employeeAttendence).click().build().perform();

}

}
