package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLoginForm {
    private WebDriver navegador;

    public PaginaLoginForm(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaLoginForm preencherLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        return this;
    }

    public PaginaLoginForm preencherSenha(String senha){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(senha);

        return this;
    }

    public PaginaInicial clicarSignIn(){
        navegador.findElement(By.id("signinbox")).findElement(By.xpath("//*[@id=\"signinbox\"]/div[2]/a")).click();

        return new PaginaInicial(navegador);
    }
}
