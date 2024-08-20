package com.bluecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TimeAndReportsPage_TD extends BasePage {

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement TimeAndReports;
    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> AllModules;
    @FindBy(xpath = "//span[.='Worktime']")
    public WebElement worktimeModule;
    @FindBy(id = "stats")
    public WebElement StatsCheckBox;
    @FindBy(id = "additional")
    public WebElement startAndEndCheckBox;
    @FindBy(id = "pagetitle")
    public WebElement AbsenceChartHeader;
}
