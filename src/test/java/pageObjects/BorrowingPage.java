package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BorrowingPage {
	
	WebDriver ldriver;

	public BorrowingPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//label[@for='application_type_single']")
	@CacheLookup
	WebElement actionTypeSingle;
	
	@FindBy(xpath="//select[@title='Number of dependants']")
	@CacheLookup
	WebElement dependantsNo;		
	
	@FindBy(xpath="//label[@for='borrow_type_home']")
	@CacheLookup
	WebElement homeToLiveIn;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div/input")
	@CacheLookup
	WebElement annualIncome;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement otherIncome;
	
	@FindBy(xpath="//input[@id='expenses']")
	@CacheLookup
	WebElement livingExpenses;
	
	@FindBy(xpath="//*[@id='homeloans']")
	@CacheLookup
	WebElement currentLoanRepayments;
	
	@FindBy(xpath="//input[@id='otherloans']")
	@CacheLookup
	WebElement otherLoanRepayments;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div/div[4]/div/input")
	@CacheLookup
	WebElement monthlyCommitments;
	
	@FindBy(xpath="//input[@id='credit']")
	@CacheLookup
	WebElement creditCardLimits;
	
	@FindBy(xpath="//span[@class='icon icon_restart']")
	@CacheLookup
	WebElement startOver;
	
	@FindBy(xpath="//button[@id='btnBorrowCalculater']")
	@CacheLookup
	WebElement workout;
	
	@FindBy(xpath="//div[@class='borrow__error__text']")
	@CacheLookup
	WebElement actualErrorText;
	
	@FindBy(xpath="//button[@id='btnBorrowCalculater']")
	@CacheLookup
	WebElement calculate;
	
	@FindBy(xpath="//span[@id='borrowResultTextAmount']")
	@CacheLookup
	WebElement amountfield;
	
	public void setAnnualIncome(String income)
	{
		annualIncome.sendKeys(income);
	}
	
	public void setOtherIncome(String otherincome)
	{
		otherIncome.sendKeys(otherincome);
	}
	
	public void setLivingExpenses(String livingexp)
	{
		livingExpenses.sendKeys(livingexp);
	}
	
	public void setCurrentHomeLoan(String currenthomeloan)
	{
		currentLoanRepayments.sendKeys(currenthomeloan);
	}
	
	public void setOtherLoanRepayments(String otherloanrepayments)
	{
		otherLoanRepayments.sendKeys(otherloanrepayments);
	}
	
	public void setMonthlyCommitments(String monthlycommitment)
	{
		monthlyCommitments.sendKeys(monthlycommitment);
	}
	
	public void setCreditCardLimits(String creditcardlimits)
	{
		creditCardLimits.sendKeys(creditcardlimits);
	}
	
	public WebElement dependantNo()
	{
		return dependantsNo;
	}
	
	public void actionType()
	{
		actionTypeSingle.click();
	}
	
	public void liveInType()
	{
		homeToLiveIn.click();
	}
	
	public void clearData()
	{
		startOver.click();
	}
	
	public void clickWorkOut()
	{
		workout.click();
	}
	
	public void validateMsg(String msg)
	{
		String expected = msg;

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String actual = actualErrorText.getText();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public void validateAmount(String amt)
	{
		String expAmt = amt;
		String actualAmt = amountfield.getText();
		if(expAmt.equals(actualAmt))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
		
	}
    
}
