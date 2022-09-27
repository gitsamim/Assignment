package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BorrowingPage;
import pageObjects.SignInPage;

public class SignInSteps {

	public WebDriver driver;
	public SignInPage signInPage;

@Given("User Open the Chrome browser")
public void user_Launch_the_Chrome_browser() {
   
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	signInPage = new SignInPage(driver);
	driver.manage().window().maximize();
}

@When("User opens the url {string}")
public void user_opens_the_site(String url) {

	driver.get(url);
}


@And("User Click on signin option")
public void user_Click_on_signin_option() {
	signInPage.clickSignIn();
}

@When("User enter email address {string}")
public void user_enter_email_address(String string) {
	signInPage.enterEmail(string);
}

@When("User Click on create account")
public void user_Click_on_create_account() {
	signInPage.createAccount();
}

@When("User enter first name {string}")
public void user_enter_first_name(String s) {
	signInPage.enterFname(s);
}

@When("User enter last name {string}")
public void user_enter_last_name(String s) {
	signInPage.enterLname(s);
}

@When("User enter password {string}")
public void user_enter_password_AS_tgb(String s) {
	signInPage.enterPassword(s);
}

@When("User enter addfirst name {string}")
public void user_enter_addfirst_name(String s) {
	signInPage.addFirstName(s);
}

@When("User enter addlast name {string}")
public void user_enter_addlast_name(String s) {
	signInPage.addLastName(s);
}

@When("User enter address {string}")
public void user_enter_address(String s) {
	signInPage.address(s);
}

@When("User enter city {string}")
public void user_enter_city(String s) {
	signInPage.cityName(s);
}

@When("User select state")
public void user_select_state() {
	WebElement ele = signInPage.state();
	Select state = new Select(ele);
	state.selectByIndex(2);
}

@When("User enter postal code {string}")
public void user_enter_postal_code(String string) {
	signInPage.postCode(string);
}

@When("User select country")
public void user_select_country() {
	WebElement ele = signInPage.country();
	Select country = new Select(ele);
	country.selectByIndex(1);
}

@When("User enter mobileno {string}")
public void user_enter_mobileno(String string) {
	signInPage.mobileNo(string);
}

@When("User enter alias address {string}")
public void user_enter_alias_address(String s) {
	signInPage.aliasAddress(s);
}

@When("User click on Register")
public void userClickRegister() {
	signInPage.register();
}

@Then("Validate user name {string}")
public void validateName(String s) {
	
	String expected = s;
	signInPage.validate(expected);
}

@Then("User click on logout")
public void user_click_on_logout() {
	signInPage.logout();
}

}
