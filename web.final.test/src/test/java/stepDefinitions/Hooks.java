package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.*;

public class Hooks {
	
public static WebDriver driver;
	
	@Before
	public void iniciateDriver() {
		//setProperty - colocar o caminho do driver desejado
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@After
	public void closeDriver() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static WebDriver getDriver()
    {
        return driver;
    }

    public static void openUrl(String url)
    {
        driver.get(url);
    }

}
