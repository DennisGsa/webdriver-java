package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaMyTasksForm {
    private WebDriver navegador;

    public PaginaMyTasksForm(WebDriver navegador){
        this.navegador = navegador;
    }

    public PaginaMyTasksForm preencherTitle(String title){
        navegador.findElement(By.id("addtask")).findElement(By.name("title")).sendKeys(title);
        return this;
    }

    public PaginaMyTasksForm preencherTexto(String text){
        navegador.findElement(By.id("addtask")).findElement(By.name("text")).sendKeys(text);

        return this;
    }

    public PaginaMyTasksForm dateLimit(){
       navegador.findElement(By.id("addtask")).findElement(By.name("date")).click();

        return this;
    }

    public PaginaMyTasksForm dateLimitEscolha(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        navegador.findElement(By.xpath("//*[@id=\"P708863177_table\"]/tbody/tr[3]/td[2]")).click();
        //navegador.findElement(By.cssSelector("#P1467400041_table > tbody > tr:nth-child(3) > td:nth-child(3) > div"));
        //navegador.findElement(By.id("P286148946_root")).findElement(By.xpath("/div/div/div/div/div[2]/div[2]/button[2]")).click();

        return this;
    }

    public PaginaMyTasksForm clockclick(){
        navegador.findElement(By.id("addtask")).findElement(By.name("time")).click();
        return this;
    }

    public PaginaMyTasksForm clock(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        navegador.findElement(By.xpath("//*[@id=\"addtask\"]/div[1]/div[3]/div[2]/div/div/div/div/div/div[2]/div[2]/button[3]")).click();
        return this;
    }

    public PaginaMyTasksForm itsDone(){
        WebElement campoDone = navegador.findElement(By.id("addtask")).findElement(By.name("done"));
        new Select(campoDone).selectByValue("yes");

        return  this;
    }

    public PaginaMyTasks clicarSave(){
        navegador.findElement(By.xpath("//*[@id=\"addtask\"]/div[2]/a"));

        return new PaginaMyTasks(navegador);
    }
}
