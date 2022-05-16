package gameMania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeLoginGameMania {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webDriver.chrome.driver", "C:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testeNavegador() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://localhost:4200/login");
		WebElement inputEmail = driver.findElement(By.id("campo-email"));
		WebElement inputSenha = driver.findElement(By.id("campo-senha"));
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
		
		
		String[] ListaSenhas = {"Senhacerta", "senhacorreta","agoravai","paredecomerbesteira"};
		
		for (int tentativas = 0; tentativas < ListaSenhas.length; tentativas++);{
			
		
		try {
		inputEmail.clear();
		inputSenha.clear();
		inputEmail.sendKeys("caique@email.com");
		inputSenha.sendKeys(ListaSenhas[tentativas]);
		botaoLogin.click();
		
		Thread.sleep(3000);
		
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}

