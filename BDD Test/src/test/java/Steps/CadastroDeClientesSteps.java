package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CadastroDeClientesSteps {

    WebDriver driver;

    Random gerador = new Random();
    int numerosGerador = gerador.nextInt(9999);

    @After
    public void screenshots() {
        TakesScreenshot ss = (TakesScreenshot) driver;
        File file = ss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/screenshots/"+numerosGerador+"cadastro.jpg"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Dado("o usuario esta na tela de cadastro")
    public void oUsuarioEstaNaTelaDeCadastro() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CJ\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://advantageonlineshopping.com/#/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEMO')]")));
        String  TextoDemo= driver.findElement(By.xpath("//span[contains(text(),'DEMO')]")).getText();
        Assert.assertEquals("DEMO", TextoDemo);
        driver.findElement(By.id("menuUser")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".create-new-account")));
        driver.findElement(By.cssSelector(".create-new-account")).click();
    }

    @Quando("preenche os seguintes dado")
    public void preenche_os_seguintes_dado(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        driver.findElement(By.name("usernameRegisterPage")).clear();
        driver.findElement(By.name("usernameRegisterPage")).
                sendKeys(map.get("Username") + numerosGerador);
        driver.findElement(By.name("emailRegisterPage")).clear();
        driver.findElement(By.name("emailRegisterPage")).sendKeys(map.get("Email"));
        driver.findElement(By.name("passwordRegisterPage")).clear();
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(map.get("Password"));
        driver.findElement(By.name("confirm_passwordRegisterPage")).clear();
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(map.get("ConPassword"));
        driver.findElement(By.name("first_nameRegisterPage")).clear();
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys(map.get("FirstName"));
        driver.findElement(By.name("last_nameRegisterPage")).clear();
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys(map.get("LastName"));
        driver.findElement(By.name("phone_numberRegisterPage")).clear();
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(map.get("PhoneNumber"));
        WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
        Select combo = new Select(element);
        combo.selectByVisibleText(map.get("Country"));
        driver.findElement(By.name("addressRegisterPage")).clear();
        driver.findElement(By.name("addressRegisterPage")).sendKeys(map.get("Address"));
        driver.findElement(By.name("postal_codeRegisterPage")).clear();
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(map.get("PostalCode"));
        driver.findElement(By.name("cityRegisterPage")).clear();
        driver.findElement(By.name("cityRegisterPage")).sendKeys(map.get("City"));
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).clear();
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(map.get("State"));
    }

    @Quando("clica em Agree e clica em registrar")
    public void clica_em_agree_e_clica_em_registrar() {
        driver.findElement(By.name("i_agree")).click();
    }

    @Então("o usuario e cadastrado com sucesso")
    public void o_usuario_e_cadastrado_com_sucesso() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String TextoCreatAccount= driver.findElement(By.xpath("//h3[contains(text(),'CREATE ACCOUNT')]")).getText();
        Assert.assertEquals("CREATE ACCOUNT", TextoCreatAccount);
        String textoUsername = driver.findElement(By.name("usernameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Test" + numerosGerador, textoUsername);
        String textoEmail = driver.findElement(By.name("emailRegisterPage")).getAttribute("value");
        Assert.assertEquals("tester@bdd.com", textoEmail);
        String textoPassword = driver.findElement(By.name("passwordRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoPassword);
        String textoConfirmPassword = driver.findElement(By.name("confirm_passwordRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456Cd", textoConfirmPassword);
        String textoFirstName = driver.findElement(By.name("first_nameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Carlos", textoFirstName);
        String textoLastName = driver.findElement(By.name("last_nameRegisterPage")).getAttribute("value");
        Assert.assertEquals("Bastos", textoLastName);
        String textoPhoneNumber = driver.findElement(By.name("phone_numberRegisterPage")).getAttribute("value");
        Assert.assertEquals("123456789", textoPhoneNumber);
        WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
        Select combo = new Select(element);
        Assert.assertEquals("Brazil" ,combo.getFirstSelectedOption().getText());
        String textoAddressNome = driver.findElement(By.name("addressRegisterPage")).getAttribute("value");
        Assert.assertEquals("Rua Japao", textoAddressNome);
        String textoPostalCode = driver.findElement(By.name("postal_codeRegisterPage")).getAttribute("value");
        Assert.assertEquals("12346-052", textoPostalCode);
        String textoCityNome = driver.findElement(By.name("cityRegisterPage")).getAttribute("value");
        Assert.assertEquals("Sao Paulo", textoCityNome);
        String textoStateNome = driver.
                findElement(By.name("state_/_province_/_regionRegisterPage")).getAttribute("value");
        Assert.assertEquals("Sao Paulo", textoStateNome);
        boolean checkBox = driver.findElement(By.name("i_agree")).isSelected();
        Assert.assertTrue(checkBox);
        driver.findElement(By.id("register_btnundefined")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEMO')]")));
        String textoUsernameCadastrado = driver.
                findElement(By.xpath("//header/nav[1]/ul[1]/li[3]/a[1]/span[1]")).getText();
        Assert.assertEquals("Test" + numerosGerador, textoUsernameCadastrado);
    }
}