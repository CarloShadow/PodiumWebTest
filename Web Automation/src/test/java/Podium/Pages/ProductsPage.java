package Podium.Pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage {


    /*************************************** PRODUCTS SETTINGS ***************************************/

    public String getProductsButtonText() {
        return getTexts(By.xpath("//span[contains(text(),'Products')]"));
    }

    public void setMouseOverOnProductsButton() {
        mouseOver("//span[contains(text(),'Products')]");
    }

    /*************************************** REVIEWS SETTINGS ***************************************/

    public String getReviewsButtonText() {
        return getTexts(By.linkText("Reviews"));
    }

    public void setClickOnReviews() {
        buttonClick(By.linkText("Reviews"));
    }

    public String getReviewsPageText() {
        return getTexts(By.linkText("Reviews"));
    }

    /*************************************** FEEDBACK SETTINGS ***************************************/

    public String getFeedbackButtonText() {
        return getTexts(By.linkText("Feedback"));
    }

    public void setClickFeedbackButton() {
        buttonClick(By.linkText("Feedback"));
    }

    public String getFeedbackPageText() {
        return getTexts(By.linkText("Feedback"));
    }

    /*************************************** PAYMENTS SETTINGS ***************************************/

    public String getPaymentsButtonText() {
        return getTexts(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public void setClickPaymentsButton() {
        buttonClick(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public String getPaymentsPageText() {
        return getTexts(By.linkText("Payments"));
    }

    /*************************************** TEAMCHAT SETTINGS ***************************************/

    public String getTeamChatButtonText() {
        return getTexts(By.linkText("Teamchat"));
    }

    public void setClickTeamChatButton() {
        buttonClick(By.linkText("Teamchat"));
    }

    public String getTeamChatPageText() {
        return getTexts(By.linkText("Teamchat"));
    }

    /*************************************** VIDEOCHAT SETTINGS ***************************************/

    public String getVideoChatButtonText() {
        return getTexts(By.xpath("//span[contains(text(),'Videochat')]"));
    }

    public void setClickVideoChatButton() {
        buttonClick(By.xpath("//span[contains(text(),'Videochat')]"));
    }

    public String getVideoChatPageText() {
        return getTexts(By.linkText("Videochat"));
    }

    /*************************************** WEBCHAT SETTINGS ***************************************/

    public String getWebChatButtonText() {
        return getTexts(By.linkText("Webchat"));
    }

    public void setClickWebchatButton() {
        buttonClick(By.linkText("Webchat"));
    }

    public String getWebChatPageText() {
        return getTexts(By.linkText("Webchat"));
    }

    /*************************************** INBOX SETTINGS ***************************************/

    public String getInboxButtonText() {
        return getTexts(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public void setClickInboxButton() {
        buttonClick(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public String getLeadInteractionPageText() {
        return getTexts(By.xpath("//span[contains(text(),'LEAD INTERACTION™')]"));
    }

    /*************************************** CAMPAIGNS SETTINGS ***************************************/

    public String getCampaignsButtonText() {
        return getTexts(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public void setClickCampaignsButton() {
        buttonClick(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public String getCampaignsPageText() {
        return getTexts(By.xpath("//p[contains(text(),'Campaigns (NEW)')]"));
    }

    /*************************************** FREE VERSION SETTINGS ***************************************/

    public String getFreeVersionButtonText() {
        return getTexts(By.id("submenu-starter-button"));
    }

    public void setClickFreeVersionButton() {
        buttonClick(By.id("submenu-starter-button"));
    }

    public String getPodiumStarterPageText() {
        return getTexts(By.xpath("//h3[contains(text(),'Podium Starter')]"));
    }

}
