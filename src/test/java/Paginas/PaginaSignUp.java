package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaSignUp {
    private WebDriver navegador;

    public PaginaSignUp(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaSignUp preencherName(String name){
        navegador.findElement(By.name("name")).sendKeys(name);

        return this;
    }

    public PaginaSignUp preencherLogin(String login){
        navegador.findElement(By.id("signupbox")).findElement(By.name("login")).sendKeys(login);

        return this;
    }

    public PaginaSignUp preencherSenha(String senha){
        navegador.findElement(By.id("signupbox")).findElement(By.name("password")).sendKeys(senha);

        return this;
    }

    public PaginaSignUp clicarSave(){
        navegador.findElement(By.id("signupbox")).findElement(By.xpath("//*[@id=\"signupbox\"]/div[2]/a")).click();

        return this;
    }



}
