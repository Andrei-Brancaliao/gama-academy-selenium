package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ConfirmacaoPage;
import pageObjects.FormPage;


public class FormSteps {

	protected WebDriver driver;
	
	@Given("^que o usuario esteja na pagina de formulario$")
	public void queOUsuarioEstejaNaPaginaDeFormulario() throws Throwable {
		Hooks.openUrl("https://demoqa.com/automation-practice-form");
		driver = Hooks.getDriver();
	}

	@When("^o usuario inserir o \"([^\"]*)\" no campo FirstName$")
	public void oUsuarioInserirONoCampoFirstName(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.preencherPrimeiroNome(arg1);
	}

	@When("^inserir o \"([^\"]*)\" no campo LastName$")
	public void inserirONoCampoLastName(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.preencherSobrenome(arg1);
	}

	@When("^inserir o \"([^\"]*)\" no campo Email$")
	public void inserirONoCampoEmail(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.preencherEmail(arg1);
	}

	@When("^selecionar o \"([^\"]*)\" no campo Gender$")
	public void selecionarONoCampoGender(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.selecionarGenero(arg1);
	}

	@When("^inserir o \"([^\"]*)\" no campo Mobile$")
	public void inserirONoCampoMobile(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.digitarTelefone(arg1);
	}
	
	@When("^selecionar a \"([^\"]*)\" no campo Date of Birth$")
	public void selecionarANoCampoDateOfBirth(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.digitarDataDeNascimento(arg1);
	}

	@When("^digitar a \"([^\"]*)\" no camapo Subjects$")
	public void digitarANoCamapoSubjects(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.digitarSubject(arg1);
	}

	@When("^selecionar a \"([^\"]*)\" na lista exibida$")
	public void selecionarANaListaExibida(String arg1) throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.selectSubject(arg1);
	}

	@When("^selecionar o hobbie$")
	public void selecionarOHobbie() throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.selectHobbies();
	}

	@When("^enviar uma imagem$")
	public void enviarUmaImagem() throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.enviarArquivo();
	}

	@When("^digitar o endereco no campo Current Address$")
	public void digitarOEnderecoNoCampoCurrentAddress() throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.digitarEndereco();
	}

	@When("^selecionar o estado e a cidade$")
	public void selecionarOEstadoEACidade() throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.scrollDown();
		pageForms.clicarEstado();
		pageForms.selecionarEstado();
		pageForms.clicarCidade();
		pageForms.selecionarCidade();
	}

	@When("^clicar no botao Submit$")
	public void clicarNoBotaoSubmit() throws Throwable {
		FormPage pageForms = new FormPage(Hooks.getDriver());
		pageForms.clicarBookStore();
		pageForms.clicarSubmit();
	}

	@Then("^sera exibido um popUp com os dados do formulario$")
	public void seraExibidoUmPopUpComOsDadosDoFormulario() throws Throwable {
		ConfirmacaoPage confirmPage = new ConfirmacaoPage(Hooks.getDriver());
		confirmPage.verificacaoPrimeiraLinha();
		confirmPage.validarColunaEsquerda();
	}
	
}
