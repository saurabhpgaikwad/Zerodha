package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redbus");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		Thread.sleep(5000);
		
		System.out.println(list.size());
		
		for(int i=0;i<=list.size()-1;i++) {
		System.out.println(list.get(i).getText());
		
		String ele = list.get(i).getText();
		
		if(ele.equals("redbus msrtc")) {
			list.get(i).click();
		}
	}driver.quit();
  }
}