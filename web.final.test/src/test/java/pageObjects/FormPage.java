package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class FormPage extends Utils{
	
	protected WebDriver driver;
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//String de endereco
	String endereco = "Rua Jose Salomeu, numero 08";
	
	//referencia de elementos
	@FindBy(how = How.ID, using = "firstName")
	private WebElement firstNameField;
		
	@FindBy (how = How.ID, using = "lastName")
	private WebElement lastNameField;
	
	@FindBy (how = How.ID, using = "userEmail")
	private WebElement emailField;

	@FindBy (how = How.ID, using = "genterWrapper")
	private WebElement genderWrapper;
	
	@FindBy (how = How.XPATH, using = "//*[@id='gender-radio-1']/following-sibling::*[@class='custom-control-label']")
	private WebElement genderMale;
		
	@FindBy (how = How.XPATH, using = "//*[@id='gender-radio-2']/following-sibling::*[@class='custom-control-label']")
	private WebElement genderFemale;	
	
	@FindBy (how = How.XPATH, using = "//*[@id='gender-radio-3']/following-sibling::*[@class='custom-control-label']")
	private WebElement genderOther;
	
	@FindBy (how = How.ID, using = "userNumber")
	private WebElement mobileNumberField;
	
	@FindBy (how = How.ID, using = "dateOfBirthInput")
	private WebElement dateOfBirthField;
	
	@FindBy (how = How.XPATH, using = "//*[@class='subjects-auto-complete__control css-yk16xz-control']")
	private WebElement subjectFieldBeforeClick;
	
	@FindBy (how = How.CSS, using = "[id^='react-select-2-option']")
	private List<WebElement> listOfSubject;
	
	@FindBy (how = How.ID, using = "hobbiesWrapper")
	private WebElement hobbiesWrapper;
	
	@FindBy (how = How.XPATH, using = "//*[@id='hobbies-checkbox-1']/following-sibling::*[@class='custom-control-label']")
	private WebElement checkBoxSports;
	
	@FindBy (how = How.XPATH, using = "//*[@id='hobbies-checkbox-2']/following-sibling::*[@class='custom-control-label']")
	private WebElement checkBoxReading;
	
	@FindBy (how = How.XPATH, using = "//*[@id='hobbies-checkbox-3']/following-sibling::*[@class='custom-control-label']")
	private WebElement checkBoxMusic;
	
	@FindBy (how = How.ID, using = "currentAddress")
	private WebElement addressFiels;
	
	@FindBy (how = How.ID, using = "state")
	private WebElement stateField;
	
	@FindBy (how = How.CSS, using = "[id^=react-select-3-option]")
	private List<WebElement> listaEstados;	
	
	@FindBy (how = How.ID, using = "city")
	private WebElement cityField;	
	
	@FindBy (how = How.CSS, using = "[id^=react-select-4-option]")
	private List<WebElement> listaCidade;	
	
	@FindBy (how = How.ID, using = "submit")
	private WebElement botaoSubmit;

	@FindBy (how = How.XPATH, using = "//*[@class='accordion'] //*[@class='header-text'][normalize-space()='Alerts, Frame & Windows']")
	private WebElement bookStore;
	
	
	//elementos que impedem a visualização completa da pagina - seja banner seja ad
	@FindBy (how = How.ID, using = "fixedban")
	private WebElement elementoParaOcultar;
	
	@FindBy (how = How.XPATH, using = "/html[1]/body[1]/div[2]/footer[1]")
	private WebElement elementoParaOcultar2;
	
	
	//metodos para utilizacao da pagina
	public void preencherPrimeiroNome(String primeiroNome) {
		firstNameField.sendKeys(primeiroNome);
		ocularElemento();
	}
	
	public void preencherSobrenome(String sobrenome) {
		esperarElemento(lastNameField);
		lastNameField.sendKeys(sobrenome);
	}
	
	public void preencherEmail(String email) {
		esperarElemento(emailField);
		emailField.sendKeys(email);
	}
	
	public void selecionarGenero(String genero) {
		esperarElemento(genderWrapper);
		switch (genero) {
			case "male":
				genderMale.click();
			break;
			
			case "female":
				genderFemale.click();
			break;
			
			case "other":
				genderOther.click();
			break;			
		}
	}
	
	public void digitarTelefone(String telefone) {
		esperarElemento(mobileNumberField);
		mobileNumberField.sendKeys(telefone);
	}
	
	public void digitarDataDeNascimento(String data) throws InterruptedException {
		esperarElemento(dateOfBirthField);
		dateOfBirthField.click();
		
		dateOfBirthField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(500);

		dateOfBirthField.sendKeys(data);
		dateOfBirthField.sendKeys(Keys.RETURN);
	}	
	
	public void digitarSubject(String subject) {
		esperarElemento(subjectFieldBeforeClick);
		subjectFieldBeforeClick.click();

		new Actions(driver)
        .sendKeys(subject)
        .perform();
	}
	
	public void selectSubject(String subject) {
		esperarListaElementos(listOfSubject);
		for(int i = 0; i < listOfSubject.size(); i++) {
			if(listOfSubject.get(i).getText().equals(subject)) {
				listOfSubject.get(i).click();
			}
		}
	}
	
	public void selectHobbies() {
//		esperarElemento(hobbiesWrapper);
		checkBoxMusic.click();
//		checkBoxReading.click();
//		checkBoxSports.click();
	}
	
	public void digitarEndereco() {
		esperarElemento(addressFiels);
		addressFiels.sendKeys(endereco);
	}
	
	public void clicarEstado() throws InterruptedException {
		esperarElemento(stateField);
		stateField.click();
	}
	
	public void selecionarEstado() {
		esperarListaElementos(listaEstados);
		listaEstados.get(0).click();
	}
	
	public void clicarCidade() {
		esperarElemento(cityField);
		cityField.click();
	}
	
	public void selecionarCidade() {
		esperarListaElementos(listaCidade);
		listaCidade.get(0).click();
	}
	
	public void clicarSubmit() {
		esperarElemento(botaoSubmit);
		botaoSubmit.click();
	}
	
	public void clicarBookStore() {
		esperarElemento(bookStore);
		bookStore.click();
	}
	
	
	@FindBy (how = How.ID, using = "uploadPicture")
	private WebElement envioDeArquivo;
	
	//metodo para envio de arquivo
	public void enviarArquivo() {
		envioDeArquivo.sendKeys("C:\\Users\\T-Gamer\\Pictures\\Debut\\Untitled 1.jpg");
	}
	
	//metodo para ocultar elementos da pagina diretamente pelo codigo
	public void ocularElemento() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.visibility='hidden'", elementoParaOcultar);
		jse.executeScript("arguments[0].style.visibility='hidden'", elementoParaOcultar2);
	}

}

