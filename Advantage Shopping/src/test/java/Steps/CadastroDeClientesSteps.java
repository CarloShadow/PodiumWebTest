package Steps;

import Core.Browser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import io.cucumber.java.pt.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import static Core.DriverFactory.getDriver;

public class CadastroDeClientesSteps {

    Browser page = new Browser();

    Random gerador = new Random();
    int numerosGerador = gerador.nextInt(9999);

    @After
    public void screenshots() {

        try {
            File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("src/screenshots/"+numerosGerador+"cadastro.jpg"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Dado("o usuario esta na tela de cadastro")
    public void oUsuarioEstaNaTelaDeCadastro() {
        page.iniciarBrowser();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEMO')]")));
        getDriver().findElement(By.id("menuUser")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".create-new-account")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".create-new-account")));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element);
    }

    @Quando("preenche os seguintes dado")
    public void preenche_os_seguintes_dado(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        getDriver().findElement(By.name("usernameRegisterPage")).clear();
        getDriver().findElement(By.name("usernameRegisterPage")).
                sendKeys(map.get("Username") + numerosGerador);
        getDriver().findElement(By.name("emailRegisterPage")).clear();
        getDriver().findElement(By.name("emailRegisterPage")).sendKeys(map.get("Email"));
        getDriver().findElement(By.name("passwordRegisterPage")).clear();
        getDriver().findElement(By.name("passwordRegisterPage")).sendKeys(map.get("Password"));
        getDriver().findElement(By.name("confirm_passwordRegisterPage")).clear();
        getDriver().findElement(By.name("confirm_passwordRegisterPage")).sendKeys(map.get("ConPassword"));
        getDriver().findElement(By.name("first_nameRegisterPage")).clear();
        getDriver().findElement(By.name("first_nameRegisterPage")).sendKeys(map.get("FirstName"));
        getDriver().findElement(By.name("last_nameRegisterPage")).clear();
        getDriver().findElement(By.name("last_nameRegisterPage")).sendKeys(map.get("LastName"));
        getDriver().findElement(By.name("phone_numberRegisterPage")).clear();
        getDriver().findElement(By.name("phone_numberRegisterPage")).sendKeys(map.get("PhoneNumber"));
        WebElement element = getDriver().findElement(By.name("countryListboxRegisterPage"));
        Select combo = new Select(element);
        combo.selectByVisibleText(map.get("Country"));
        getDriver().findElement(By.name("addressRegisterPage")).clear();
        getDriver().findElement(By.name("addressRegisterPage")).sendKeys(map.get("Address"));
        getDriver().findElement(By.name("postal_codeRegisterPage")).clear();
        getDriver().findElement(By.name("postal_codeRegisterPage")).sendKeys(map.get("PostalCode"));
        getDriver().findElement(By.name("cityRegisterPage")).clear();
        getDriver().findElement(By.name("cityRegisterPage")).sendKeys(map.get("City"));
        getDriver().findElement(By.name("state_/_province_/_regionRegisterPage")).clear();
        getDriver().findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(map.get("State"));
    }

    @Quando("clica em Agree e clica em registrar")
    public void clica_em_agree_e_clica_em_registrar() {
        getDriver().findElement(By.name("i_agree")).click();
    }

    @Então("o usuario e cadastrado com sucesso")
    public void o_usuario_e_cadastrado_com_sucesso() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        String TextoCreatAccount= getDriver().findElement(By.xpath("//h3[contains(text(),'CREATE ACCOUNT')]")).getText();
        Assert.assertEquals("CREATE ACCOUNT", TextoCreatAccount);
        String textoUsername = getDriver().findElement(By.name("usernameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Test" + numerosGerador, textoUsername);
        String textoEmail = getDriver().findElement(By.name("emailRegisterPage")).getAttribute("value");
        Assert.assertEquals("tester@bdd.com", textoEmail);
        String textoPassword = getDriver().findElement(By.name("passwordRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoPassword);
        String textoConfirmPassword = getDriver().findElement(By.name("confirm_passwordRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoConfirmPassword);
        String textoFirstName = getDriver().findElement(By.name("first_nameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Carlos", textoFirstName);
        String textoLastName = getDriver().findElement(By.name("last_nameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Bastos", textoLastName);
        String textoPhoneNumber = getDriver().findElement(By.name("phone_numberRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456789", textoPhoneNumber);
        WebElement element = getDriver().findElement(By.name("countryListboxRegisterPage"));
        Select combo = new Select(element);
        Assert.assertEquals("Brazil" ,combo.getFirstSelectedOption().getText());
        String textoAddressNome = getDriver().findElement(By.name("addressRegisterPage")).getAttribute("value");
        Assert.assertEquals("Rua Japao", textoAddressNome);
        String textoPostalCode = getDriver().findElement(By.name("postal_codeRegisterPage")).getAttribute("value");
        Assert.assertEquals("12346-052", textoPostalCode);
        String textoCityNome = getDriver().findElement(By.name("cityRegisterPage")).getAttribute("value");
        Assert.assertEquals("Sao Paulo", textoCityNome);
        String textoStateNome = getDriver().
                findElement(By.name("state_/_province_/_regionRegisterPage")).getAttribute("value");
        Assert.assertEquals("Sao Paulo", textoStateNome);
        boolean checkBox = getDriver().findElement(By.name("i_agree")).isSelected();
        Assert.assertTrue(checkBox);
        getDriver().findElement(By.id("register_btnundefined")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuUserLink")));
        String textoUsernameCadastrado = getDriver().
                findElement(By.linkText("Test" + numerosGerador)).getText();
        Assert.assertEquals("Test" + numerosGerador, textoUsernameCadastrado);

    }
}