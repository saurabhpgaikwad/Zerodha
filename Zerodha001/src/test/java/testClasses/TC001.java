package testClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import configuration.Path;

public class TC001 
{
	WebDriver driver;
	
	@Test
	@Parameters ("BrowserName")
	public void chrome(String value) throws InterruptedException
	{
		if(value.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", Path.DriverChrome);
		
		driver = new ChromeDriver();
		
		driver.get(Path.fb_login);
		
		}
		
		else if(value.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Path.Driver_Fox);
			driver = new FirefoxDriver();
			driver.get(Path.Amz_URL);
		}
		else
		{
			System.out.println("xxxxxxxxxxxx please enter valid Browser Name xxxxxxxxxxxxxxx");
		}
			
	}
}
