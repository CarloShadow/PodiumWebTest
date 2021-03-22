package Podium.Pages;

import Podium.Core.BasePage1;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage1 {

    /*************************************** PRODUCTS SETTINGS ***************************************/

    public String getProductsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Products')]"));
    }

    public void setMouseOverOnProductsButton() {
        page_.mouseOver("//span[contains(text(),'Products')]");
    }

    /*************************************** REVIEWS SETTINGS ***************************************/

    public String getReviewsButtonText() {
        return page_.getTexts(By.linkText("Reviews"));
    }

    public void setClickOnReviews() {
        page_.buttonClick(By.linkText("Reviews"));
    }

    public String getReviewsPageText() {
        return page_.getTexts(By.linkText("Reviews"));
    }

    /*************************************** FEEDBACK SETTINGS ***************************************/

    public String getFeedbackButtonText() {
        return page_.getTexts(By.linkText("Feedback"));
    }

    public void setClickFeedbackButton() {
        page_.buttonClick(By.linkText("Feedback"));
    }

    public String getFeedbackPageText() {
        return page_.getTexts(By.linkText("Feedback"));
    }

    /*************************************** PAYMENTS SETTINGS ***************************************/

    public String getPaymentsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public void setClickPaymentsButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public String getPaymentsPageText() {
        return page_.getTexts(By.linkText("Payments"));
    }

    /*************************************** TEAMCHAT SETTINGS ***************************************/

    public String getTeamChatButtonText() {
        return page_.getTexts(By.linkText("Teamchat"));
    }

    public void setClickTeamChatButton() {
        page_.buttonClick(By.linkText("Teamchat"));
    }

    public String getTeamChatPageText() {
        return page_.getTexts(By.linkText("Teamchat"));
    }

    /*************************************** VIDEOCHAT SETTINGS ***************************************/

    public String getVideoChatButtonText() {
        return page_.getTexts(By.linkText("Videochat"));
    }

    public void setClickVideoChatButton() {
        page_.buttonClick(By.linkText("Videochat"));
    }

    public String getVideoChatPageText() {
        return page_.getTexts(By.linkText("Videochat"));
    }

    /*************************************** WEBCHAT SETTINGS ***************************************/

    public String getWebChatButtonText() {
        return page_.getTexts(By.linkText("Webchat"));
    }

    public void setClickWebchatButton() {
        page_.buttonClick(By.linkText("Webchat"));
    }

    public String getWebChatPageText() {
        return page_.getTexts(By.linkText("Webchat"));
    }

    /*************************************** INBOX SETTINGS ***************************************/

    public String getInboxButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public void setClickInboxButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public String getLeadInteractionPageText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'LEAD INTERACTION™')]"));
    }

    /*************************************** CAMPAIGNS SETTINGS ***************************************/

    public String getCampaignsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public void setClickCampaignsButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public String getCampaignsPageText() {
        return page_.getTexts(By.xpath("//p[contains(text(),'Campaigns (NEW)')]"));
    }

    /*************************************** FREE VERSION SETTINGS ***************************************/

    public String getFreeVersionButtonText() {
        return page_.getTexts(By.id("submenu-starter-button"));
    }

    public void setClickFreeVersionButton() {
        page_.buttonClick(By.id("submenu-starter-button"));
    }

    public String getPodiumStarterPageText() {
        return page_.getTexts(By.xpath("//h3[contains(text(),'Podium Starter')]"));
    }

}
