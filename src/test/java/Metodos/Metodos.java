package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Metodos {

	WebDriver driver;
	
	// Metodo para abrir/maximizar navegador

	public void AbrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Metodo para clicar

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Metodo para preencher
	public void preencher(By elemento, String nome) {
		driver.findElement(elemento).sendKeys(nome);
	}

	// Metodo para pausar

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	// Metodo para fechar navegador

	public void fecharNavegador() {
		driver.quit();
	}

	// Metodo para validar texto

	public void validarTexto(By elemento, String textoEsperado) {
	    // Captura o texto do elemento e remove espaços extras no início e no final
	    String mensagemCapturada = driver.findElement(elemento).getText().trim();
	    
	    // Remove múltiplos espaços e substitui por um único espaço
	    mensagemCapturada = mensagemCapturada.replaceAll("\\s+", " ");
	    textoEsperado = textoEsperado.trim().replaceAll("\\s+", " ");
	    
	    // Exibe o texto capturado para depuração
	    System.out.println("Texto Capturado: [" + mensagemCapturada + "]");
	    
	    // Compara o texto esperado com o capturado
	    assertEquals(textoEsperado, mensagemCapturada);
	
	}

	// Metodo para tirar print

	public void tirarPrint(String nome) throws IOException {
		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File Desfile = new File("./src/evidencias" + nome + ".png");
		FileUtils.copyFile(SrcFile, Desfile);
	}

	// Método para aguardar o elemento ficar visível
    public void aguardarElementoVisivel(By elemento, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
    
    public void selecionar(By elemento, String valor) {
        // Cria uma instância de Select baseada no elemento do dropdown
        Select dropdown = new Select(driver.findElement(elemento));
        
        // Seleciona a opção do dropdown pelo texto visível
        dropdown.selectByVisibleText(valor);
    }
    
    public void duploClique(By elemento) {
        // Cria uma instância de Actions para realizar interações avançadas
        Actions action = new Actions(driver);
        
        // Realiza o duplo clique no elemento especificado
        action.doubleClick(driver.findElement(elemento)).perform();
    }
    
    // Método para aguardar o elemento estar clicável
    public void aguardarElementoClicavel(By elemento, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }
}