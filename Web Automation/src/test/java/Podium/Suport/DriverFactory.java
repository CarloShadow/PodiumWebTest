package Podium.Suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
