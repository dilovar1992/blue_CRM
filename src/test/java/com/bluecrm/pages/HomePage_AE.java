package com.bluecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_AE extends BasePage {

    //list of profile menu pop-up items
    @FindBy(xpath = "//div[@id='popup-window-content-menu-popup-user-menu']//div[@class='menu-popup-items']/*")
    public List<WebElement> profileMenuItems;
}
