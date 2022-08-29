package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	protected WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (how = How.ID, using = "firstname")
	private WebElement firstNameField;
	
	@FindBy (how = How.ID, using = "lastname")
	private WebElement lastNameField;
	
	@FindBy (how = How.ID, using = "userName")
	private WebElement usernameField;
	
	@FindBy (how = How.ID, using = "password")
	private WebElement passwordField;
	
	public void insertFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	public void insertLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	public void insertUsername(String userName) {
		usernameField.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		passwordField.sendKeys(password);
	}
	
}
