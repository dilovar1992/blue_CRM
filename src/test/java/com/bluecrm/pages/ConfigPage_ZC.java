package com.bluecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigPage_ZC extends BasePage{

    @FindBy(css = "span#left-menu-settings")
    public WebElement configureMenu;

    @FindBy (css = "span.menu-popup-item-text")
    public List<WebElement> configureMenuOptions;
}
