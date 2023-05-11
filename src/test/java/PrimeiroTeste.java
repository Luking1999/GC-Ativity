import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {

	private WebDriver driver;

	@Before
	public void setup() {
		// Configurar o caminho para o driver do Chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");

		// Inicializar o WebDriver
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		// Encerrar o WebDriver
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void testHelloWorld() {
		// Navegar para a página
		driver.get("http://localhost:8080/gc-ativity/");

		// Localizar o elemento desejado
		WebElement element = driver.findElement(By.tagName("h2"));

		// Obter o texto do elemento
		String message = element.getText();

		// Verificar se o texto é igual a "Hello World!"
		Assert.assertEquals("Hello World!", message);
	}
	
	@Test
	public void testPageTitle() {
		// Navegar para a página
		driver.get("http://localhost:8080/gc-ativity/");

		// Obter o título da página
		String pageTitle = driver.getTitle();

		// Verificar se o título está correto
		Assert.assertEquals("GC atividade", pageTitle);
	}

}
