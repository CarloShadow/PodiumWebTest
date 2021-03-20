package Podium.Suport;

import org.junit.Before;
import java.util.concurrent.TimeUnit;
import static Podium.Suport.DriverFactory.getDriver;

public class BaseTest {

    Link link = new Link();

    @Before
    public void PesquisaImoveis() {
        // Opens Driver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers1\\msedgedriver.exe");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        link.acessHomePage();

    }
}
