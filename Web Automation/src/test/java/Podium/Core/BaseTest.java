package Podium.Core;

import org.junit.Before;
import java.util.concurrent.TimeUnit;
import static Podium.Core.DriverFactory.getDriver;

public class BaseTest {

    Link link = new Link();

    String driverFilePath = "C:\\Users\\CJ\\webdrivers\\chromedriver.exe";
    String driverName = "chrome";

    @Before
    public void PesquisaImoveis() {
        // Opens Driver
        System.setProperty("webdriver." + driverName + ".driver", driverFilePath);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        link.acessHomePage();

    }
}
