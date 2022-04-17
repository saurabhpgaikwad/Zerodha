 package testClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import baseClasses.Utility;
import configuration.Path;

public class RunnerClass 
{
	WebDriver driver;   // to use driver variable in all methods
	String tcID;  		// use to give tcID to methods
	Utility utl;		// use to call all methods from utility class
	WebElement voting;
	
	@BeforeClass
	public void browserLaunch()
	{
		BaseClass base = new BaseClass();
		driver = base.driverInit();
		utl = new Utility();
	}
	@Test
	public void tc01()
	{
		tcID = "TC01";
		
		WebElement account = driver.findElement(By.xpath("//a[text() = 'Already have an account?']"));
		String actual = "Already have an account?";
		String expected = account.getText();
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void tc02()
	{
		tcID= "TC02";
		voting = driver.findElement(By.xpath("//a[text() = 'Voting Information Centre']"));
		System.out.println(voting.getText());
		
		String actual = "Voting Information Centrerr";        // test case fail
		String expected = voting.getText();
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterMethod
	public void captureScreen(ITestResult res) throws IOException
	{                                                         // ITestResult get Result of previous @Test
		if(ITestResult.FAILURE == res.getStatus())            // will takeScreenshot only of status of @Test is Failure
		{
			utl.takeScreeenshot(tcID, driver);
		}
	}
	
}
