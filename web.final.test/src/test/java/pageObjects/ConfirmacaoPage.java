package pageObjects;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;


public class ConfirmacaoPage extends Utils{
	
	protected WebDriver driver;
	
	public ConfirmacaoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (how = How.CLASS_NAME, using = "")
	private WebElement elemento;
	
	@FindBy (how = How.XPATH, using = "//html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th")
	private List<WebElement> listaPrimeiraLinha;
	
	@FindBy (how = How.XPATH, using = "//html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[1]")
	private List<WebElement> listaColunaEsquerda;
	
	@FindBy (how = How.XPATH, using = "//html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[2]")
	private List<WebElement> listaColunaDireita;
	
	public void verificacaoPrimeiraLinha() {
		esperarListaElementos(listaPrimeiraLinha);
		assertTrue(listaPrimeiraLinha.get(0).getText().equals("Label"));
		assertTrue(listaPrimeiraLinha.get(1).getText().equals("Values"));
	}	
	
	//lista criada com elementos internos existentes baseado no visual do formulario
	List<String> listaFormularioEsquerda = Arrays.asList(
			"Student Name",
			"Student Email",
			"Gender",
			"Mobile",
			"Date of Birth",
			"Subjects",
			"Hobbies",
			"Picture",
			"Address",
			"State and City"
			);
	
	//criacao da coluna baseaso nos dados inciais - procurar forma de parametrizar isso com os dados inseridos inicialmente
	List<String> listaFormularioDireita = Arrays.asList(
			"Anndrei Farto da Silva",
			"andrei@gmail.com",
			"Female",
			"1957878806",
			"07 July,1993",
			"Maths",
			"Music",
			"Untitled 1.jpg",
			"Rua Jose Salomeu, numero 08",
			"NCR Delhi"
			);
	
	public void validarColunaEsquerda() {
		for(int i = 0; i < listaColunaEsquerda.size(); i++) {
			assertTrue(listaColunaEsquerda.get(i).getText().equals(listaFormularioEsquerda.get(i)));
		}
	}

	public void validarColunaDireita() {
		for(int i = 0; i < listaColunaDireita.size(); i++) {
			assertTrue(listaColunaDireita.get(i).getText().equals(listaFormularioDireita.get(i)));
		}
	}
}
