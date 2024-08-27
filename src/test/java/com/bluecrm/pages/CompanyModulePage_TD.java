package com.bluecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CompanyModulePage_TD extends BasePage{
    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> allModules;
    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyLink;
}
