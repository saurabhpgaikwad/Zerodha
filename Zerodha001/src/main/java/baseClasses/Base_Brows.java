package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Path;

public class Base_Brows 
{
	public static WebDriver initbrowser()
	{
		System.setProperty("webdriver.chrome.driver", Path.DriverChrome);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
