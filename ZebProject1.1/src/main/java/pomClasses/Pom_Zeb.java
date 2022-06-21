package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Zeb 
{
	@FindBy (xpath = "//button[@class='action-search']") private WebElement XSearchButton;
	
	@FindBy (xpath = "//input[@id='search']") private WebElement XInputTab;

	@FindBy (xpath = "//ul[@role='listbox']") private WebElement XListBox;
	
	@FindBy (xpath = "(//img[@class='lazyLoad product-image-photo normal-image img-responsive  lazyloaded'])[2]") private WebElement XT_Shirt1;
	
	@FindBy (xpath = "//select[@name='super_attribute[180]']") private WebElement XSelect_Size;
	
	@FindBy (xpath = "//button[@type='submit']//span[text()='VOEG TOE AAN WINKELWAGEN']") private WebElement XAddToCart;
	
	@FindBy (xpath = "//span[text()='GA DOOR NAAR CHECKOUT']") private WebElement XProcedToCheckout1;
	
	@FindBy (xpath = "//button[@data-role='Ga door naar Checkout']") private WebElement XProcedToCheckout2;

	@FindBy (xpath = "//font[text()='Click here to log in']") private WebElement XLoginToAccount;
	
	@FindBy (xpath = "(//input[@id='customer-email'])[1]") private WebElement XEmailAddress;
	
	@FindBy (xpath = "(//input[@id='customer-password'])[1]") private WebElement XPassword;
	
	
	
	
	
	@FindBy (xpath = "//table[@class='table-checkout-shipping-method']//tr[1]//td[1]") private WebElement XHomeDelivery;
	
	@FindBy (xpath = "//input[@id='FB1P4PQ']") private WebElement XFirstName;
	
	@FindBy (xpath = "//input[@id='L21CJMW']") private WebElement XLastName;
	
	@FindBy (xpath = "//select[@id='TSTO5CO']") private WebElement XSelectCountry;
	
	@FindBy (xpath = "//input[@id='CPXHPPH']") private WebElement XPostalCode;
	
	@FindBy (xpath = "//input[@id='EJCVPHW']") private WebElement XPlace;
	
	@FindBy (xpath = "//input[@id='FJ4Q4P2']") private WebElement XAddress;
	
	@FindBy (xpath = "//input[@id='TTDIL13']") private WebElement XHouseNo;
	
	@FindBy (xpath = "(//font[text()='Continue to payment details'])") private WebElement XContinueToPayment;
	
	
	
	
	
	
	public Pom_Zeb(WebDriver driverxx)
	{
		PageFactory.initElements(driverxx, this);
	}
	
	
	
	
	public void clickOnSearch()
	{
		XSearchButton.click();
	}
	
	public void enterProduct(String product)
	{
		XInputTab.sendKeys(product);
	}
	

	
}
