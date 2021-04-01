package Core;

import java.util.concurrent.TimeUnit;
import static Core.DriverFactory.getDriver;

public class Browser {

    // Coloque dentro da variável abaixo o diretório do seu driver
    String browserDriverPath = "C:\\Users\\CJ\\WebDrivers\\chromedriver.exe";

    // Coloque dentro da variável abaixo o nome do seu driver
    String nomeBrowser = "chrome";

    public void iniciarBrowser() {
        System.setProperty("webdriver."+nomeBrowser+".driver", browserDriverPath);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("https://advantageonlineshopping.com/#/");
    }

}
