package testClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base_Brows;
import baseClasses.Utility;
import configuration.Path;
import pomClasses.Kite_Login;

public class KT_TC101 
{
	WebDriver driver;
	Utility utl;
	Kite_Login kt;
	String tcID;
	
	@BeforeClass
	public void launchBrows()
	{
		Base_Brows base = new Base_Brows();
		driver = base.initbrowser();
		
		utl = new Utility();
		
		kt = new Kite_Login(driver);
		
	}
	
	@BeforeMethod
	public void getURL()
	{
		driver.get(Path.kiteLogin);
	}
	
	@Test
	public void tc101()
	{
		tcID ="TC101";
		
		kt.clickLogin();           // keep userName and Password blank and click on Login
		
		Assert.assertEquals(kt.msgUsername(), "User ID should be minimum 6 characters."); // Check error message for UserName

		Assert.assertEquals(kt.msgPass(), "Password should be minimum 6 characters.");    // check error message for Pass
		
		
	}
	@Test
	public void tc102()
	{
		tcID ="TC102";
		
		kt.enterUser("TKY981");     // enter userName and keep password Blank  
		kt.clickLogin();            // then click on Login
		
		System.out.println(kt.msgUsername());
		System.out.println(kt.msgPass());
		
		Assert.assertEquals(kt.msgPass(), "Password should be minimum 6 characters.");      // check error message for Pass
		
	}
	@Test
	public void tc103()
	{
		tcID ="TC103";
		
		kt.entePass("897600");      // enter Password and keep userName Blank 
		kt.clickLogin();            // then click on  Login
		
		Assert.assertEquals(kt.msgUsername(), "User ID should be minimum 6 characters."); // Check error message for UserName
		
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
	public void closeBrows() throws InterruptedException
	{
//		Thread.sleep(10000);
	//	driver.quit();
	}
	
	
	

}
