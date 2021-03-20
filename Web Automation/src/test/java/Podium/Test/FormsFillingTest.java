package Podium.Test;

import Podium.Pages.FormsFillingPage;
import Podium.Suport.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class FormsFillingTest extends BaseTest {

    FormsFillingPage page = new FormsFillingPage();

    @Test
    public void enterpriseFormsFilling() {

        // Verifying if "Enterprise" button is present, clicking on it and validating the page
        Assert.assertEquals("Enterprise", page.getEnterpriseTextButton());
        page.setClickEnterpriseButton();
        Assert.assertEquals("ENTERPRISE", page.getEnterprisePageText());

        // Filling Enterprise page forms, BUT NOT SENDING
        page.setTypeFirstName();
        page.setTypeLastName();
        page.setTypeEmail();
        page.setTypeLocationsNumber();
        page.setTypeCompany();
        page.setTypeMobilePhone();

        // Verifying filled fields from Enterprise page forms
        Assert.assertEquals("Peter", page.getFirstNameText());
        Assert.assertEquals("Parker", page.getLastNameText());
        Assert.assertEquals("peter@parker.com", page.getEmailText());
        Assert.assertEquals("10", page.getLocationsNumberText());
        Assert.assertEquals("Stark Industries", page.getCompanyText());
        Assert.assertEquals("12345678", page.getMobilePhoneText());

    }

    @Test
    public void pricingFormsFilling() {

        // Verifying if "Pricing" button is present, clicking on it and validating the page
        Assert.assertEquals("Pricing", page.getPricingTextButton());
        page.setClickPricingButton();
        Assert.assertEquals("CUSTOM PRICING", page.getPricingPageText());

        // Filling Pricing page forms, BUT NOT SENDING
        page.setTypeFirstNamePricingPage();
        page.setTypeLastNamePricingPage();
        page.setTypeEmailPricingPage();
        page.setTypeCompanyPricingPage();
        page.setTypeMobilePhonePricingPage();

        // Verifying filled fields from Pricing page forms
        Assert.assertEquals("Gerald", page.getFirstNameTextPricingPage());
        Assert.assertEquals("Rivia", page.getLastNameTextPricingPage());
        Assert.assertEquals("gerald@rivia.com", page.getEmailTextPricingPage());
        Assert.assertEquals("School of the Wolf", page.getCompanyTextPricingPage());
        Assert.assertEquals("12345678", page.getMobilePhoneTextPricingPage());
    }
}
