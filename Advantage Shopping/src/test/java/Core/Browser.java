package Core;

import java.util.concurrent.TimeUnit;

import static Core.DriverFactory.getDriver;

public class Browser {

    public void iniciarBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CJ\\WebDrivers\\chromedriver.exe");
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("https://advantageonlineshopping.com/#/");
    }
}
