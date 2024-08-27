package com.bluecrm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MainPage_DT extends BasePage {
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciation;
    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;
    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement displayedMessage;
    @FindBy(id="feed-add-post-form-link")
    public WebElement dropdown;
    @FindBy(id="feed-add-post-form-link-more")
    public WebElement MORE;

    @FindBy(id="blog-submit-button-cancel")
    public WebElement cancelButton;
    @FindBy(xpath="//span[@class='feed-add-post-micro-title']")
    public WebElement sendMessageText;
}
