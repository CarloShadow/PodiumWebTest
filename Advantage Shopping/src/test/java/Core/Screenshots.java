package Core;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static Core.DriverFactory.getDriver;

public class Screenshots {

    Random gerador = new Random();
    int numerosGerador = gerador.nextInt(9999);

    public void screenshot() {
        try {
            File file = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("src/screenshots/"+numerosGerador+".jpg"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
