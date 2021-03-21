package Podium.Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static Podium.Core.DriverFactory.getDriver;

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

    public void type(By id, String text){
        getDriver().findElement(id).clear();
        getDriver().findElement(id).sendKeys(text);
    }

    public String getFieldValue(String id_field) {
        return getDriver().findElement(By.id(id_field)).getAttribute("value");
    }
}
