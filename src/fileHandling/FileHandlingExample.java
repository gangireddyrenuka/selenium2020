package fileHandling;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileHandlingExample 
{
	@Test
  public void TestFileExample() throws IOException
  {
	  File f=new File("WebDrivers","testdata.txt");
	   boolean status = f.exists();
	   System.out.println(status);
	  f.createNewFile();
	  System.out.println(status);
	  File folder=new File("Featuer");
	  folder.exists();
  }
	
	
	
}
