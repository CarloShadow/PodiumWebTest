// OBSERVATION: I HAVEN'T SENT ANY DATA AS IT WAS ASKED

package Podium.Tests;

import Podium.Pages.FillingFormsWithDDTPage;
import Podium.Suport.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import java.util.Arrays;
import org.junit.runners.Parameterized.Parameter;
import java.util.Collection;
import org.junit.runners.Parameterized.Parameters;
import static Podium.Suport.DriverFactory.getDriver;

@RunWith(Parameterized.class)
public class FillingFormsWithDDTTest extends BaseTest {

    FillingFormsWithDDTPage page = new FillingFormsWithDDTPage();

    @Parameter
    public String firstName;
    @Parameter(value=1)
    public String lastName;
    @Parameter(value=2)
    public String email;
    @Parameter(value=3)
    public String company;
    @Parameter(value=4)
    public String mobilePhone;

    // Data to fill the forms
    @Parameters
    public static Collection<Object[]> getCollection() {
        return Arrays.asList(new Object[][]{
                {"Gerald", "Rivia", "gerald@rivia.com", "School of The Wolf", "123456"},
                {"Bruce", "Wayne", "bruce@wayne.com", "Wayne Enterprises", "1234568"},
                {"Tony", "Stark", "tony@stark.com", "Stark Industries", "654564564"},
                {"Clark", "Kent", "clark@kent.com", "Daily Planet", "1234568"},
                {"Harley", "Quinn", "harley@quinn.com", "Arkham Asylum", "12348568"}
        });
    }

    @Test
    public void mustFillPricingForms() {

        // Verifying if "Pricing" button is present, clicking on it and validating the page
        Assert.assertEquals("Pricing", page.getPricingTextButton());
        page.setClickPricingButton();
        Assert.assertEquals("CUSTOM PRICING", page.getPricingPageText());

        // Filling Pricing page forms (BUT NOT SENDING)
        getDriver().findElement(By.id("FirstName")).sendKeys(firstName);
        getDriver().findElement(By.id("LastName")).sendKeys(lastName);
        getDriver().findElement(By.id("Email")).sendKeys(email);
        getDriver().findElement(By.id("Company")).sendKeys(company);
        getDriver().findElement(By.id("MobilePhone")).sendKeys(mobilePhone);

        // Verifying filled fields from Pricing page forms
        Assert.assertEquals(firstName, page.getFirstNameTextPricingPage());
        Assert.assertEquals(lastName, page.getLastNameTextPricingPage());
        Assert.assertEquals(email, page.getEmailTextPricingPage());
        Assert.assertEquals(company, page.getCompanyTextPricingPage());
        Assert.assertEquals(mobilePhone, page.getMobilePhoneTextPricingPage());
    }
}
