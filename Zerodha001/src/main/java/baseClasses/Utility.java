package baseClasses;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import configuration.Path;
public class Utility 
{
	public void takeScreeenshot(String tcID, WebDriver driverxx) throws IOException
	{
		File src = ((TakesScreenshot)driverxx).getScreenshotAs(OutputType.FILE);
		 
		 Date dt = new Date();
		 String date = dt.toString().replace(":", "_");
		 
		File dest = new File(Path.Local_ScrPath + tcID + "_" + date + ".jpg");
		
		FileHandler.copy(src, dest);
	}
	
	//  To Get ScreenShot of Particular Element
	
	public void takeScreeenshot(String tcID, WebElement vote) throws IOException
	{
		 File src = vote.getScreenshotAs(OutputType.FILE);
		 
		 Date dt = new Date();
		 String date = dt.toString().replace(":", "_");
		 
		File dest = new File(Path.Local_ScrPath + tcID + "_" + date + ".jpg");
		
		FileHandler.copy(src, dest);
	}

	
	
	
}
