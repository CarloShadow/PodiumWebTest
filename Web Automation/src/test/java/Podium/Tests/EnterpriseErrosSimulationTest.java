// OBSERVATION: I HAVEN'T SENT ANY DATA AS IT WAS ASKED

package Podium.Tests;

import Podium.Pages.FormsFillingPage;
import Podium.Suport.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnterpriseErrosSimulationTest extends BaseTest {

    FormsFillingPage page = new FormsFillingPage();

    @Before
    public void mustGoToEnterprisePage() {

        // Verifying if "Enterprise" button is present, clicking on it and validating the page
        Assert.assertEquals("Enterprise", page.getEnterpriseTextButton());
        page.setClickEnterpriseButton();
        Assert.assertEquals("ENTERPRISE", page.getEnterprisePageText());

    }

    @Test
    public void mustDoFieldRequiredError() {
        // Clicking on request button and verifying error message
        page.clickRequestButton();
        Assert.assertEquals("This field is required.", page.getFieldRequiredErrorText());

    }

    @Test
    public void mustDoValidEmailError() {

        page.setTypeInvalidEmail();
        Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAA", page.getInvalidEmailText());
        page.clickRequestButton();

    }
}
