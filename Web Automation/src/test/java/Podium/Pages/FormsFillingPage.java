package Podium.Pages;

import Podium.Core.BasePage1;
import org.openqa.selenium.By;

public class FormsFillingPage extends BasePage1 {

    /*************************************** GOING TO ENTERPISE PAGE  ***************************************/

    public String getEnterpriseTextButton() {
        return page_.getTexts(By.linkText("Enterprise"));
    }

    public void setClickEnterpriseButton() {
        page_.buttonClick(By.linkText("Enterprise"));
    }

    public String getEnterprisePageText() {
        return page_.getTexts(By.xpath("//div[contains(text(),'Enterprise')]"));
    }

    /*************************************** EMPTY ERROR SIMULATION  ***************************************/

    public void clickRequestButton() {
        page_.buttonClick(By.xpath("//button[contains(text(),'Request Information')]"));
    }

    public String getFieldRequiredErrorText() {
            return page_.getTexts(By.id("ValidMsgFirstName"));
    }

    /*************************************** EMPTY ERROR SIMULATION  ***************************************/

    public void setTypeInvalidEmail() {
        page_.type(By.id("Email"), "AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public String getInvalidEmailText() {
        return page_.getFieldValue("Email");
    }

}
