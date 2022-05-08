package Pom;



public class Pomclass {
	@FindBy(xpath="//input[@name= 'firstname']")private WebElement Fname;
	  @FindBy(xpath="//input[@name= 'lastname']")private WebElement Lname;
	  @FindBy(xpath="//input[@name='reg_email__']")private WebElement Email;
	  @FindBy(xpath="//input[@data-type='password']")private WebElement Password;
	  @FindBy(xpath="//button[@type='submit']")private WebElement Logbtn;
	  @FindBy(xpath="//select[@title='Month']")private WebElement Month;
	  @FindBy(xpath="//select[@title='Day']")private WebElement Day;
	  @FindBy(xpath="//select[@title='Year']")private WebElement Year;

		public Pomclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
		void Pomclass(WebDriver ar)
		 {
			PageFactory.initElements(ar, this);
		 }
	  public void Enterfname(String fname) 
	  {
		Fname.sendKeys(fname);
	  }	
		
	 public void EnterLname(String lname) 
	 {
		Lname.sendKeys(lname);
	 } 
	 public void EnterEmail(String email) 
	  	{
		 Email.sendKeys(email);
		 
	  	}
	 	public void Enterpassword(String pass) 
	 	{
		 Password.sendKeys(pass);
	  	}
	 	public void clicklogin() 
	 		{
	 			Logbtn.click();
	 		}
	 	public void selectday(String day ) 
	 		{
	 			Select sel = new Select(Day);
	 			sel.selectByValue(day);
	 			
	 		}
	 	
	 	  public void selectMonth(String mon) 
	 			{
	 				Select ss = new Select(Month);
	 				ss.selectByValue(mon);
	 			} 
	 	  public void selectYear(String yo) 
	 			{
	 				Select ss = new Select(Year);
	 				ss.selectByValue(yo);
	 			}
	 	
	 	
	 }


