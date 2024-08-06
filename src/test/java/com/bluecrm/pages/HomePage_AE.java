package com.bluecrm.pages;

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


}
