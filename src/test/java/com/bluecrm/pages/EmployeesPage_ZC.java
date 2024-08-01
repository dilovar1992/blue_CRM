package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage_ZC extends BasePage{

    @FindBy (xpath = "//span[contains(text(),'Employees')]")
    public WebElement employeesPage;
}
