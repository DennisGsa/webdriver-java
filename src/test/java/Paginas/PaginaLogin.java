package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin {
    private WebDriver navegador;

    public PaginaLogin(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaSignUp clicarCriarUsuario(){
        navegador.findElement(By.id("signup")).click();

        return new PaginaSignUp(navegador);
    }

    public PaginaLoginForm clicarLogin(){
        navegador.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li/a")).click();

        return new PaginaLoginForm(navegador);
    }
}
