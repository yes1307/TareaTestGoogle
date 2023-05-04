import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {//Hereda de base test
    private WebDriver webDriver = getWebDriver(); //aquí voy a volver a crear un webdrive privado, aqui se reutiliza nuevamente del BaseTest
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);

    @Test(priority = 0)
    public void openGoogle() {
        //webDriver.get("https://www.google.com/");// esta línea se rectorisa ahora con el método
        googleSteps.abrirPaginaGoogle();
        //declarar
        //String urlActual = webDriver.getCurrentUrl();// refactoriso por que ya tengo un metodo de la BaseTest ejemplo sig:
        String urlActual = googleSteps.getURLActual();
        System.out.println("La URL actua es: " + urlActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
    }

    @Test(priority = 1)
    public void titleGoogle() {
        googleSteps.abrirPaginaGoogle();
        String titiloActual = googleSteps.getTituloLActual();
        System.out.println("La Titulo actual es: " + titiloActual);
    }

    @Test(priority = 1)
    public void codigoFuenteGoogle() {
        googleSteps.abrirPaginaGoogle();
        String codigoFuenteActual = googleSteps.getCodigoLActual();
        System.out.println("La codigo actual es: " + codigoFuenteActual);
    }

    @Test(priority = 2)
    public void cerrarVentanaGoogle() {
        googleSteps.abrirPaginaGoogle();
        googleSteps.cerrarVentana();
        System.out.println("Cerrando .....");
    }

    @Test(priority = 3)
    public void finalizarDriveChrome() {
        googleSteps.finalizarWebDriver();
        System.out.println("Fin .....");
    }
}
