package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage_ZC extends BasePage{

    @FindBy (xpath = "//span[contains(text(),'Employees')]")
    public WebElement employeesPage;

    @FindBy (xpath = "//div[@id='top_menu_id_company']//span[@class='main-buttons-item-text']/span[2]")
    public List<WebElement> employeeModules;

    @FindBy (xpath = "//span[.='Add department'][1]")
    public WebElement addDepartmentButton;

    @FindBy (xpath = "//input[@id='NAME']")
    public WebElement departmentNameInputBox;

    @FindBy (xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy (xpath = "//a[@href='/company/structure.php?set_filter_structure=Y&structure_UF_DEPARTMENT=175']")
    public WebElement newDepartment;
}
