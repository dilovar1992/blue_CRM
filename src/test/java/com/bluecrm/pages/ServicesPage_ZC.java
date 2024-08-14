package com.bluecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicesPage_ZC extends BasePage{

    @FindBy(xpath = "//span[contains(text(), 'Services')]")
    public WebElement servicesPage;

    @FindBy(css = "span.main-buttons-item-text-title")
    public List<WebElement> servicesModules;

    @FindBy (xpath = "//span[.='FAQ']")
    public WebElement faqButton;

    @FindBy (xpath = "//tbody//nobr//a")
    public List<WebElement> faqDocuments;

}
