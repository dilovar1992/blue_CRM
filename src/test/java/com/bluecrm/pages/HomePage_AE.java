package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_AE extends BasePage {

    //list of profile menu pop-up items
    @FindBy(xpath = "//div[@id='popup-window-content-menu-popup-user-menu']//div[@class='menu-popup-items']/*")
    public List<WebElement> profileMenuItems;

    //iframe element, must switch to frame
    @FindBy(css = "div#bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm>iframe")
    public WebElement messageIframe;

    @FindBy (css = "body[contenteditable = true]")
    public WebElement messageInputBox;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement collapsedMessageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement messageSubmitButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement messageCancelButton;

    @FindBy(xpath = "(//div[contains(@id, 'blog_post_body')])[1]")
    public WebElement topFeedMessege;

    @FindBy(xpath = "//div[.='My Tasks']")
    public WebElement myTasksWidgetHeader;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a")
    public List<WebElement> desktopClients;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]/a")
    public List<WebElement> mobileClients;

    @FindBy(css = "div.sidebar-widget-item-wrap>a>span.task-item-text")
    public List<WebElement> myTasksWidgetOptions;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(id = "question_0")
    public WebElement questionInputBox;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1InputBox;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2InputBox;

    @FindBy(xpath = "(//li[contains(@id,'question')]/div)[1]")
    public WebElement postedPollQuestion;

    @FindBy(xpath = "(//input[contains(@id,'vote_radio')])[1]/../following-sibling::label")
    public WebElement postedPollAnswer1;

    @FindBy(xpath = "(//input[contains(@id,'vote_radio')])[2]/../following-sibling::label")
    public WebElement postedPollAnswer2;




    public WebElement getWidget(String widgetTitle){

        widgetTitle = widgetTitle.toUpperCase();
        String first = ""+widgetTitle.charAt(0);

        widgetTitle = widgetTitle.toLowerCase();

        widgetTitle = widgetTitle.replaceFirst(String.valueOf(widgetTitle.charAt(0)),first);

        String locator = "//div[@id='sidebar']//div[.='"+widgetTitle+"']";

        //locate and return
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    /**
     * Gets iframe webelement and switchs to it and adds message content to the body of message box. and switches back to default content
     * @param iframe
     * @param messageContent
     */

    public void addMessageToFrame(WebElement iframe, String messageContent){
        Driver.getDriver().switchTo().frame(iframe);
        messageInputBox.clear();
        messageInputBox.sendKeys(messageContent);
        Driver.getDriver().switchTo().defaultContent();
    }
}
