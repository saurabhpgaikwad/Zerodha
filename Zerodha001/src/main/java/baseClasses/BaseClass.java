package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Path;

public class BaseClass 
{
	public WebDriver driverInit()
	{
	System.setProperty("webdriver.chrome.driver", Path.DriverChrome);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Path.fb_signup);
	return driver;
	
	}

}
