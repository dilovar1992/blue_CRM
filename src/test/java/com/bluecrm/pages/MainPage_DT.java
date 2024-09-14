package com.bluecrm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MainPage_DT extends BasePage {
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciation;

    //TODO to be removed if not in use
    @FindBy(id="feed-add-post-form-link")
    public WebElement dropdown;
    @FindBy(id="feed-add-post-form-link-more")
    public WebElement MORE;

    @FindBy(xpath="//span[@class='feed-add-post-micro-title']")
    public WebElement sendMessageText;
}
