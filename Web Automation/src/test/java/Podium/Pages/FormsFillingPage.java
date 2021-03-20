package Podium.Pages;

import org.openqa.selenium.By;

public class FormsFillingPage extends BasePage1{

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

    /*************************************** ENTERPRISE FILLING FORMS FIELD **********************************/

    public void setTypeFirstName() {
        page_.type("FirstName", "Peter");
    }

    public void setTypeLastName() {
        page_.type("LastName", "Parker");
    }

    public void setTypeEmail() {
        page_.type("Email", "peter@parker.com");
    }

    public void setTypeLocationsNumber() {
        page_.type("No_of_Locations__c", "10");
    }

    public void setTypeCompany() {
        page_.type("Company", "Stark Industries");
    }

    public void setTypeMobilePhone() {
        page_.type("MobilePhone", "12345678");
    }

    /************************************ ENTERPRISE VERIFYING FILLED FORMS FIELD ****************************/

    public String getFirstNameText() {
        return page_.getFieldValue("FirstName");
    }

    public String getLastNameText() {
        return page_.getFieldValue("LastName");
    }

    public String getEmailText() {
        return page_.getFieldValue("Email");
    }

    public String getLocationsNumberText() {
        return page_.getFieldValue("No_of_Locations__c");
    }

    public String getCompanyText() {
        return page_.getFieldValue("Company");
    }

    public String getMobilePhoneText() {
        return page_.getFieldValue("MobilePhone");
    }

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

    /*************************************** PRICING FILLING FORMS FIELD ************************************/

    public void setTypeFirstNamePricingPage() {
        page_.type("FirstName", "Gerald");
    }

    public void setTypeLastNamePricingPage() {
        page_.type("LastName", "Rivia");
    }

    public void setTypeEmailPricingPage() {
        page_.type("Email", "gerald@rivia.com");
    }

    public void setTypeCompanyPricingPage() {
        page_.type("Company", "School of the Wolf");
    }

    public void setTypeMobilePhonePricingPage() {
        page_.type("MobilePhone", "12345678");
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
