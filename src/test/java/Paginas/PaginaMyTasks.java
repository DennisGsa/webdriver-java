package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class PaginaMyTasks {
    private WebDriver navegador;

    public PaginaMyTasks(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaMyTasksForm clicarAddTask(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        navegador.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();

        return new PaginaMyTasksForm(navegador);
    }

    public PaginaMyTasks validarTask(){
        navegador.findElement(By.xpath("//*[@id=\"tasklist\"]/li/span"));
        assertEquals("Teste","Teste");

        return this;
    }

}
