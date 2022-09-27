package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import pageObjects.BorrowingPage;
import pageObjects.SignInPage;

public class Steps {

	public WebDriver driver;
	public BorrowingPage borrowing;
	public SignInPage signInPage;

@Given("User Launch the Chrome browser")
public void user_Launch_the_Chrome_browser() {
   
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	borrowing = new BorrowingPage(driver);
	driver.manage().window().maximize();
}

@When("User opens the site {string}")
public void user_opens_the_site(String url) {

	driver.get(url);
}

@When("User Click Application type as Single")
public void user_Click_Application_type_as_Single() {

	borrowing.actionType();
}

@When("User Click dependants as zero")
public void user_select_dependants_as() {
 
	WebElement ele = borrowing.dependantNo();
	Select dependent = new Select(ele);
	dependent.selectByIndex(0);
}

@When("User select home to live in")
public void user_select_c_home_to_live_in() {
 
	borrowing.liveInType();
}

@When("User enter income {string}")
public void user_enter_income(String income) {
    
	borrowing.setAnnualIncome(income);
}

@When("User enter other income {string}")
public void user_enter_other_income(String otherincome) {

	borrowing.setOtherIncome(otherincome);
}

@When("User enter living expenses {string}")
public void user_enter_living_expenses(String livingexp) {

	borrowing.setLivingExpenses(livingexp);
}

@When("User enter current home loan repayments {string}")
public void user_enter_current_home_loan_repayments(String currenthomeloan) {
    
	borrowing.setCurrentHomeLoan(currenthomeloan);
}

@When("User enter other loan repayments {string}")
public void user_enter_other_loan_repayments(String otherloanrepayments) {
   
	borrowing.setOtherLoanRepayments(otherloanrepayments);
}

@When("User enter other commitments {string}")
public void user_enter_other_commitments(String monthlycommitment) {

	borrowing.setMonthlyCommitments(monthlycommitment);
}

@When("User enter total credit card limits {string}")
public void user_enter_total_credit_card_limits(String creditcardlimits) {
    
	borrowing.setCreditCardLimits(creditcardlimits);
}

@When("User Click the Start Over button")
public void user_Click_the_Start_Over_button() {
  
	borrowing.clearData();
}

@When("User Click on the Work out how much I could borrow")
public void userClickWorkOut() {
  
	borrowing.clickWorkOut();
}

@Then("Validate the message {string}")
public void validateMessage(String msg) {
  
	borrowing.validateMsg(msg);
}

@When("User click Work out")
public void userWorkOut() {
  
	borrowing.clickWorkOut();
}

@Then("validate the amount {string}")
public void validateAmount(String msg) {
  
	borrowing.validateAmount(msg);
}


}
