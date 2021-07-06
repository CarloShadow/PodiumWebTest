package Steps;

import Core.Browser;
import Core.Propriedades;
import Core.Screenshots;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;
import static Core.DriverFactory.killDriver;

public class LoginSteps {

    Browser page = new Browser();
    Screenshots images = new Screenshots();

    @After()
    public void fecharBrowser(){
        images.screenshot();
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {
        page.iniciarBrowser();
        getDriver().findElement(By.id("menuUser")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    @Quando("preenche o Username com <Test81>")
    public void preenche_o_username_com_test81() {
        getDriver().findElement(By.name("username")).clear();
        getDriver().findElement(By.name("username")).sendKeys(("Test2345"));
    }

    @Quando("preenche Password com <123456Cd>")
    public void preenche_password_com() {
        getDriver().findElement(By.name("password")).clear();
        getDriver().findElement(By.name("password")).sendKeys("123456Cd");
    }

    @Então("o login e feito com sucesso")
    public void o_login_e_feito_com_sucesso() {
        String textoUsername = getDriver().findElement(By.name("username")).getAttribute("value");
        Assert.assertEquals("Test2345", textoUsername);
        String textoPassword = getDriver().findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoPassword);
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btnundefined")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
        String textoUsernameCadastrado = getDriver().
                findElement(By.linkText("Test2345")).getText();
        Assert.assertEquals("Test2345", textoUsernameCadastrado);
    }
}