package Podium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static Podium.Suport.DriverFactory.getDriver;

public class BasePage {

    public String getTexts(By by) {
        return getDriver().findElement(by).getText();
    }

    public void buttonClick(By by) {
        getDriver().findElement(by).click();
    }

    public void mouseOver(String xpath) {
        WebElement products = getDriver().findElement(By.xpath(xpath));
        Actions act = new Actions(getDriver());
        act.moveToElement(products).perform();
    }

    public void type(String id, String texto){
        getDriver().findElement(By.id(id)).clear();
        getDriver().findElement(By.id(id)).sendKeys(texto);
    }

    public String getFieldValue(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).getAttribute("value");
    }
}
