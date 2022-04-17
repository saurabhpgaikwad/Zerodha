package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup 
{

	// Declaring Global variable with access modifier as private
	
	@FindBy(xpath = ("//input[@name='firstname']")) private WebElement FName;
	@FindBy(xpath = ("//input[@name='lastname']")) private WebElement LName;
	@FindBy(xpath = ("//input[@name='reg_email__']")) private WebElement Email;
	@FindBy(xpath = ("//input[@name='reg_email_confirmation__']")) private WebElement ConfEmail;        
	@FindBy(xpath = ("//input[@name='reg_passwd__']")) private WebElement Pass;
	@FindBy(xpath = ("//select[@name='birthday_day']")) private WebElement Day;
	@FindBy(xpath = ("//select[@name='birthday_month']")) private WebElement Month;
	@FindBy(xpath = ("//select[@name='birthday_year']")) private WebElement Year;
	@FindBy(xpath = ("//label[text() = 'Male']")) private WebElement Male;
	@FindBy(xpath = ("//label[contains(text(), 'Fe')]")) private WebElement Female;
	@FindBy(xpath = ("//button[@name='websubmit']")) private WebElement Signup;
	
	
	// Initializing Global variable into Constructor
	FB_Signup(WebDriver driverxx)
	{
		PageFactory.initElements(driverxx, this);     // .initElements() method has internal relation with @[Annotation]
	}
	
	
	// Usages of variables into method
	
	public void enterFName(String firstName)
	{
		FName.sendKeys(firstName);
	}
	
	public void enterLName(String lastName)    // public void methofName(argument)
	{
		LName.sendKeys(lastName);              // GlobalVariable.sendKeys(arguments)
	}
	
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void reEntEmail(String reEmail)
	{
		ConfEmail.sendKeys(reEmail);
	}
	
	
	public void enterPass(String pwd)
	{
		Pass.sendKeys(pwd);
	}
	
	public void selectDay(String value)
	{
		Select dy = new Select(Day);
		dy.selectByValue(value);
	}
	
	public void selectMonth(String text)
	{
		Select mn = new Select(Month);
		mn.selectByVisibleText(text);
	}
	
	public void selectYear(int index)
	{
		Select yr = new Select(Year);
		yr.selectByIndex(index);
	}
	public void radioMale()
	{
		Male.click();
	}
	public void radioFemale()
	{
		Female.click();
	}
	
	public void clickSignup()
	{
		Signup.click();
	}
	

}
