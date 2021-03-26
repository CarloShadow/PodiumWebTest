package Podium.Pages;

import org.openqa.selenium.By;

public class FormsFillingPage extends BasePage {

    /*************************************** GOING TO ENTERPRISE PAGE  ***************************************/

    public String getEnterpriseTextButton() {
        return getTexts(By.linkText("Enterprise"));
    }

    public void setClickEnterpriseButton() {
        buttonClick(By.linkText("Enterprise"));
    }

    public String getEnterprisePageText() {
        return getTexts(By.xpath("//div[contains(text(),'Enterprise')]"));
    }

    /*************************************** EMPTY ERROR SIMULATION  ***************************************/

    public void clickRequestButton() {
        buttonClick(By.xpath("//button[contains(text(),'Request Information')]"));
    }

    public String getFieldRequiredErrorText() {
            return getTexts(By.id("ValidMsgFirstName"));
    }

    /*************************************** INVALID E-MAIL ERROR SIMULATION  ***************************************/

    public void setTypeInvalidEmail() {
        type(By.id("Email"), "AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public String getInvalidEmailText() {
        return getFieldValue("Email");
    }

}
