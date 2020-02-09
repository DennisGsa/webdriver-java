package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PaginaInicial {
    private WebDriver navegador;

    public PaginaInicial(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaMyTasks clicarCriarTask(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/p[2]/a")).click();

        return new PaginaMyTasks(navegador);
    }

}
