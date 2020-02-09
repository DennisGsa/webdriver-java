# webdriver-java

Descrição: Projeto para desenvolvimento de automação para o Site TaskIt!

Para executar o projeto, será necessário instalar os seguintes programas/driver:

JDK : Necessário para executar o projeto Java
Maven 3.5.3: Necessário para realizar o build do projeto Java
Selenium WebDriver
ChromeDriver 
Intellij: Para desenvolvimento do projeto

Desenvolvimento:

Para iniciar o desenvolvimento, é necessario clonar o projeto para um diretorio.

  cd "diretorio de sua preferencia"
  git clone https://github.com/DennisGsa/webdriver-java.git

Extrair driver ChromeDriver para pasta de drivers desejada


Testes:

Para executar os testes é necessario apontar o metodo inicial para o diretorio que foi extraido o ChromeDriver.

"public void inicial(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\<diretorio>\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("http://www.juliodelima.com.br/taskit/");
        navegador.manage().window().maximize();
    }"
