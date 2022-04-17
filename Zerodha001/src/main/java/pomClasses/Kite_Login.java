package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login 
{
	@FindBy (xpath = "//input[@id='userid']") private WebElement username;
	@FindBy (xpath = "//input[@id='password']") private WebElement passwors;
	@FindBy (xpath = "//button[contains(text(), 'Login')]") private WebElement login;
	
	@FindBy (xpath = "(//span[@class='su-message'])[1]") private WebElement msg_user;
	@FindBy (xpath = "(//span[@class='su-message'])[2]") private WebElement msg_pass;
	
	
	public Kite_Login(WebDriver driverxx)
	{
		PageFactory.initElements(driverxx, this);
	}
	
	public void enterUser(String user)
	{
		username.sendKeys(user);
	}
	
	public void entePass(String pass)
	{
		passwors.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public String msgUsername()     // must Return String value otherwise Assertion will not Happen
	{
		String error = msg_user.getText();
		return error;
	}
	
	public String msgPass()         // must Return String value otherwise Assertion will not Happen
	{
		String error2 = msg_pass.getText();
		return error2;
	}
	
	
}
