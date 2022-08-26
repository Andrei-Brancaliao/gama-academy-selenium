package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	
	public void verificacaoPrimeiraLinha() {
		esperarListaElementos(listaPrimeiraLinha);
		assertTrue(listaPrimeiraLinha.get(0).getText().equals("Label"));
		assertTrue(listaPrimeiraLinha.get(1).getText().equals("Values"));
	}
	
	@FindBy (how = How.XPATH, using = "//html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[1]")
	private List<WebElement> listaColuna;
	
	public void validarColunaEsquerda() {
		for(int i = 0; i < listaColuna.size(); i++) {
			System.out.println(listaColuna.get(i).getText());
		}
	}
	
//	/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]
//	int num_rows = len (driver.find_elements_by_xpath("//*[@id='customers']/tbody/tr"))
			
			
}
