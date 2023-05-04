package Steps;

import org.openqa.selenium.WebDriver;

public class GoogleSteps extends BaseSteps {

    public GoogleSteps(WebDriver driver) {
        super(driver);
    }

    public void abrirPaginaGoogle() {
        webDriver.get("https://www.google.com/");
    }
}
