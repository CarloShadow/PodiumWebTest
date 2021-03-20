package Podium.Test;

import Podium.Pages.ProductsPage;
import Podium.Suport.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductsTest extends BaseTest {

    ProductsPage page = new ProductsPage();

    @Before
    public void productsStarting() {

        // Verifying if the "Products" button is present and mouse hovering on it
        Assert.assertEquals("Products", page.getProductsButtonText());
        page.setMouseOverOnProductsButton();

    }

    @Test
    public void reviewsPageTest() {

        // Verifying "Reviews" button, clicking on it and validating the page
        Assert.assertEquals("Reviews" ,page.getReviewsButtonText());
        page.setClickOnReviews();
        Assert.assertEquals("Reviews", page.getReviewsPageText());
    }

    @Test
    public void feedbackPageTest() {

        // Verifying "Feedback" button, clicking on it and validating the page
        Assert.assertEquals("Feedback", page.getFeedbackButtonText());
        page.setClickFeedbackButton();
        Assert.assertEquals("Feedback", page.getFeedbackPageText());

    }

    @Test
    public void paymentsPageTest() {

        // Verifying "Payments" button, clicking on it and validating the page
        Assert.assertEquals("Payments", page.getPaymentsButtonText());
        page.setClickPaymentsButton();
        Assert.assertEquals("Payments", page.getPaymentsPageText());
    }

    @Test
    public void teamChatPageTest() {

        // Verifying "Teamchat" button, clicking on it and validating the page
        Assert.assertEquals("Teamchat", page.getTeamChatButtonText());
        page.setClickTeamChatButton();
        Assert.assertEquals("Teamchat", page.getTeamChatPageText());
    }

    @Test
    public void videoChatPageTest() {

        // Verifying "Videochat" button, clicking on it and validating the page
        Assert.assertEquals("Videochat", page.getVideoChatButtonText());
        page.setClickVideoChatButton();
        Assert.assertEquals("Videochat", page.getVideoChatPageText());
    }

    @Test
    public void webChatPageTest() {

        // Verifying "Webchat" button, clicking on it and validating the page
        Assert.assertEquals("Webchat", page.getWebChatButtonText());
        page.setClickWebchatButton();
        Assert.assertEquals("Webchat", page.getWebChatPageText());
    }

    @Test
    public void inboxPageTest() {

        // Verifying "Inbox" button, clicking on it and validating the page
        Assert.assertEquals("Inbox", page.getInboxButtonText());
        page.setClickInboxButton();
        Assert.assertEquals("LEAD INTERACTION™", page.getLeadInteractionPageText());
    }

    @Test
    public void campaignsPageTest() {

        // Verifying "Campaigns" button, clicking on it and validating the page
        Assert.assertEquals("Campaigns", page.getCampaignsButtonText());
        page.setClickCampaignsButton();
        Assert.assertEquals("Campaigns (NEW)", page.getCampaignsPageText());
    }

    @Test
    public void freeVersionPageTest() {

        // Verifying "Free Version" button, clicking on it and validating the page
        Assert.assertEquals("Interested in trying our free version?", page.getFreeVersionButtonText());
        page.setClickFreeVersionButton();
        Assert.assertEquals("Podium Starter", page.getPodiumStarterPageText());
    }

}
