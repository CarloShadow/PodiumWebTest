package Podium.Pages;

import org.openqa.selenium.By;

public class FillingFormsWithDDTPage extends BasePage {

    /***************************************** GOING TO PRICING PAGE *****************************************/

    public String getPricingTextButton() {
        return getTexts(By.linkText("Pricing"));
    }

    public void setClickPricingButton() {
        buttonClick(By.linkText("Pricing"));
    }

    public String getPricingPageText() {
        return getTexts(By.xpath("//div[contains(text(),'custom pricing')]"));
    }


    /************************************ VERIFYING PRICING FILLED FORMS FIELD *******************************/

    public String getFirstNameTextPricingPage() {
        return getFieldValue("FirstName");
    }

    public String getLastNameTextPricingPage() {
        return getFieldValue("LastName");
    }

    public String getEmailTextPricingPage() {
        return getFieldValue("Email");
    }

    public String getCompanyTextPricingPage() {
        return getFieldValue("Company");
    }

    public String getMobilePhoneTextPricingPage() {
        return getFieldValue("MobilePhone");
    }
}
