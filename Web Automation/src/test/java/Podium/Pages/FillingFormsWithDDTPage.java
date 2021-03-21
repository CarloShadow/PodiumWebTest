package Podium.Pages;

import org.openqa.selenium.By;

public class FillingFormsWithDDTPage extends BasePage1 {

    /***************************************** GOING TO PRICING PAGE *****************************************/

    public String getPricingTextButton() {
        return page_.getTexts(By.linkText("Pricing"));
    }

    public void setClickPricingButton() {
        page_.buttonClick(By.linkText("Pricing"));
    }

    public String getPricingPageText() {
        return page_.getTexts(By.xpath("//div[contains(text(),'custom pricing')]"));
    }


    /************************************ PRICING VERIFYING FILLED FORMS FIELD *******************************/

    public String getFirstNameTextPricingPage() {
        return page_.getFieldValue("FirstName");
    }

    public String getLastNameTextPricingPage() {
        return page_.getFieldValue("LastName");
    }

    public String getEmailTextPricingPage() {
        return page_.getFieldValue("Email");
    }

    public String getCompanyTextPricingPage() {
        return page_.getFieldValue("Company");
    }

    public String getMobilePhoneTextPricingPage() {
        return page_.getFieldValue("MobilePhone");
    }
}
