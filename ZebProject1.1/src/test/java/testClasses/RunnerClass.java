 package testClasses;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilityClasses.Utility;
import baseClasses.Base_Class;

public class RunnerClass 
{
	WebDriver driver;   // to use driver variable in all methods
	Utility utl;		// use to call all methods from utility class
	String tcID;  		// use to give tcID to methods
	
	@BeforeClass
	public void browserLaunch()
	{
		Base_Class base = new Base_Class();
		driver = base.initChrome();
		utl = new Utility();
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		
	}
	
	@Test
	public void tc01()
	{
		tcID = "TC01";

	}
	

	
	@AfterMethod
	public void captureScreen(ITestResult res) throws IOException
	{                                                         // ITestResult get Result of previous @Test
		if(ITestResult.FAILURE == res.getStatus())            // will takeScreenshot only of status of @Test is Failure
		{
			utl.takeScreeenshot(tcID, driver);
		}
	}
	
	@AfterClass
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(7000);
		
		driver.close();
	}
	
}
