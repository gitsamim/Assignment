package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class SignInPage {

	WebDriver ldriver;

	public SignInPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(xpath="//input[@id='email_create']")
	@CacheLookup
	WebElement emailId;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	@CacheLookup
	WebElement createAccount;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='passwd']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@id='firstname']")
	@CacheLookup
	WebElement addFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	@CacheLookup
	WebElement addLastName;
	
	@FindBy(xpath="//input[@id='address1']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	@CacheLookup
	WebElement postCode;
	
	@FindBy(xpath="//select[@id='id_country']")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='alias']")
	@CacheLookup
	WebElement aliasAddress;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	@CacheLookup
	WebElement register;
	
	@FindBy(xpath="//a[@class='account']")
	@CacheLookup
	WebElement validateText;
	
	@FindBy(xpath="//a[@class='logout']")
	@CacheLookup
	WebElement logout;
	
	
	public void clickSignIn()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		signIn.click();
	}
	
	public void enterEmail(String email)
	{
		emailId.sendKeys(email); 
	}
	
	public void createAccount()
	{
		createAccount.click();
	}
	
	public void enterFname(String fname)
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		firstName.sendKeys(fname); 
	}
	
	public void enterLname(String lname)
	{
		lastName.sendKeys(lname); 
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass); 
	}
	
	public void addFirstName(String name)
	{
		addFirstName.sendKeys(name); 
	}
	
	public void addLastName(String last)
	{
		addLastName.sendKeys(last); 
	}
	
	public void address(String add)
	{
		address.sendKeys(add); 
	}
	
	public void cityName(String c)
	{
		city.sendKeys(c); 
	}
	
	public WebElement state()
	{
		return state;
	}
	
	public void postCode(String c)
	{
		postCode.sendKeys(c); 
	}
	
	public WebElement country()
	{
		return country;
	}
	
	public void mobileNo(String mob)
	{
		mobile.sendKeys(mob); 
	}
	
	public void aliasAddress(String aliasAddres)
	{
		aliasAddress.sendKeys(aliasAddres); 
	}
	
	public void register()
	{
		register.click();
	}
	
	public void validate(String exp)
	{
		String expected = exp;
		String actual = validateText.getText();
		System.out.println("actual===============" + actual);
		
		Assert.assertEquals(expected, actual);
//		if(actual.contains(expected))
//		{
//			System.out.println("PASS");
//		}
	} 
	
	public void logout()
	{
		logout.click();
	}	
	
}




















