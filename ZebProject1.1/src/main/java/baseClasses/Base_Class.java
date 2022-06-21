package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configuration.Path;

public class Base_Class 
{
	
//  =======================  Chrome Browser=============================
	
	public WebDriver initChrome()
	{
		System.setProperty("webdriver.chrome.driver", Path.DriverChrome);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
//  =======================  Firefox Browser=============================
	
	public WebDriver initFirefox()
	{
		System.setProperty("webdriver.gecko.driver", Path.Driver_Fox);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		return driver;
	}
	
//  =======================  InternetExplore Browser=============================
	
	public WebDriver initIE()
	{
		System.setProperty("webdriver.ie.driver", Path.DriverChrome);
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}

}
