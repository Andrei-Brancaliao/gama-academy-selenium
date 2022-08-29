package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegisterPage;

public class RegisterSteps {

	protected WebDriver driver;
	
	@Given("^I am at the register page$")
	public void iAmAtTheRegisterPage() throws Throwable {
		Hooks.openUrl("https://demoqa.com/register");
		driver = Hooks.getDriver();
	}

	@When("^I fill the first name as \"([^\"]*)\"$")
	public void iFillTheFirstNameAs(String arg1) throws Throwable {
		RegisterPage pageRegister = new RegisterPage(driver);
		pageRegister.insertFirstName(arg1);
	}

	@When("^fill the last name as \"([^\"]*)\"$")
	public void fillTheLastNameAs(String arg1) throws Throwable {
		RegisterPage pageRegister = new RegisterPage(driver);
		pageRegister.insertLastName(arg1);
	}

	@When("^fill the username as \"([^\"]*)\"$")
	public void fillTheUsernameAs(String arg1) throws Throwable {
		RegisterPage pageRegister = new RegisterPage(driver);
		pageRegister.insertUsername(arg1);
	}

	@When("^fill the password as \"([^\"]*)\"$")
	public void fillThePasswordAs(String arg1) throws Throwable {
		RegisterPage pageRegister = new RegisterPage(driver);
		pageRegister.insertPassword(arg1);
	}

	@When("^bypass the captcha$")
	public void bypassTheCaptcha() throws Throwable {

	}

	@When("^click on register$")
	public void clickOnRegister() throws Throwable {

	}

	@Then("^it will show a successful register popUp$")
	public void itWillShowASuccessfulRegisterPopUp() throws Throwable {

	}	
}
