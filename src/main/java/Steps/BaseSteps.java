package Steps;
//Plantilla de la base de mi configuracion
//Metodos que no son exclusivos para una sola función, son publicos para utilizar en otros

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    public WebDriver webDriver; //aquí esta public

    //CONSTRUCTOR que recibe
    public BaseSteps(WebDriver driver) {
        this.webDriver = driver;
    }

    //METODOS
    public String getURLActual() {
        return webDriver.getCurrentUrl();
    }

    public String getTituloLActual() {
        return webDriver.getTitle();
    }

    public String getCodigoLActual() {
        return webDriver.getPageSource();
    }

    public void cerrarVentana() {
        webDriver.close();
    }

    public void finalizarWebDriver() {
        webDriver.quit();
    }
}
