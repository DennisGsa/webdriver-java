package tests;

import Paginas.PaginaLogin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestesDesafio {
    private WebDriver navegador;
    @Before
    public void inicial(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\denni\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("http://www.juliodelima.com.br/taskit/");
        navegador.manage().window().maximize();
    }

    @Test
    public void logar(){
        new PaginaLogin(navegador)
                .clicarLogin()
                .preencherLogin("Dennis123")
                .preencherSenha("123456")
                .clicarSignIn();
    }

    @Test
    public void criarUser(){
        new PaginaLogin(navegador)
                .clicarCriarUsuario()
                .preencherName("Dennis")
                .preencherLogin("dgaraujo")
                .preencherSenha("123456")
                .clicarSave();
    }

    @Test
    public void criarTask(){
        new PaginaLogin(navegador)
                .clicarLogin()
                .preencherLogin("Dennis123")
                .preencherSenha("123456")
                .clicarSignIn()
                .clicarCriarTask()
                .clicarAddTask()
                .preencherTitle("Tamo junto")
                .preencherTexto("É noiz")
                .dateLimit()
                .dateLimitEscolha()
                .clockclick()
                .clock()
                .itsDone()
                .clicarSave()
                .validarTask();
    }

    @Test
    public void LerTask(){
        new PaginaLogin(navegador)
            .clicarLogin()
            .preencherLogin("Dennis123")
            .preencherSenha("123456")
            .clicarSignIn()
            .clicarCriarTask()
            .validarTask();
    }

    @After
    public void pos(){
        navegador.close();
    }
}
