package Podium.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (Properties.browser) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;
                case EDGE: driver = new EdgeDriver(); break;
                case SAFARI: driver = new SafariDriver(); break;
            }
        }
        return driver;
    }
    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}