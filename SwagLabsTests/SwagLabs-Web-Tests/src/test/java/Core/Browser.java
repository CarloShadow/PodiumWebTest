package Core;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Browser {


	public void iniciarBrowser() {
		WebDriver driver = DriverFactory.getDriver();

		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
