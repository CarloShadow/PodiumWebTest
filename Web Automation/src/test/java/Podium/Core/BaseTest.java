package Podium.Core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static Podium.Core.DriverFactory.getDriver;
import static Podium.Core.DriverFactory.killDriver;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    Link link = new Link();

    // Put your browser driver below
    String driverFilePath = "C:\\Users\\CJ\\webdrivers\\chromedriver.exe";
    // Choose you browser driver name | OPTIONS (chrome, edge, gecko or safari)
    String driverName = "chrome";

    @Before
    public void PesquisaImoveis() {
        // Opens Driver
        System.setProperty("webdriver." + driverName + ".driver", driverFilePath);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        link.accessHomePage();
    }

    @After
    public void Finishes() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File file = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src" + File.separator + "Screenshots" +
                File.separator + testName.getMethodName() + ".jpg"));

        if(Properties.FECHAR_BROWSER) {
            killDriver();
        }
    }
}
