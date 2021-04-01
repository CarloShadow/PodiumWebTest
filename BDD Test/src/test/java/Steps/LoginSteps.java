package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CJ\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://advantageonlineshopping.com/#/");
        driver.findElement(By.id("menuUser")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    @Quando("preenche o Username com <Test81>")
    public void preenche_o_username_com_test81() {
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(("Test81"));
    }

    @Quando("preenche Password com <123456Cd>")
    public void preenche_password_com() {
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456Cd");

    }

    @Então("o login e feito com sucesso")
    public void o_login_e_feito_com_sucesso() {
        String  textoUsername = driver.findElement(By.name("username")).getAttribute("value");
        Assert.assertEquals("Test81", textoUsername);
        String  textoPassword = driver.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoPassword);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btnundefined")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
}
