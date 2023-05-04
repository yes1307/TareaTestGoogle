import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseTest {
    //lo voy a encapsular para que no cree varios web drive
    private WebDriver webDriver; //siempre encapsulado

    public WebDriver getWebDriver() {
        File ruta = new File("/Users/Yesenia/Documents/QA_Mind/CursoSelenium/controladoresNavegador/chromedriver.exe");
        System.setProperty("webdriver.chromedriver", ruta.getPath());
        ChromeOptions opciones = new ChromeOptions();
        //opciones.addArguments("--incognito");
        opciones.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(opciones);
        return webDriver;// Devuelve
    }

}
