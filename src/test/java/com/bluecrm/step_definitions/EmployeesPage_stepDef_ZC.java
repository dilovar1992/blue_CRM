package com.bluecrm.step_definitions;

import com.bluecrm.pages.EmployeesPage_ZC;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class EmployeesPage_stepDef_ZC {

    EmployeesPage_ZC employeesPageZc = new EmployeesPage_ZC();

    @When("users click on the Employees page")
    public void users_click_on_the_employees_page() {
        employeesPageZc.employeesPage.click();
    }


    @Then("users see following {int} modules")
    public void usersSeeFollowingModules(int expectedModuleNumber, List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(employeesPageZc.employeeModules);

        Assert.assertEquals(expectedModuleNumber, actualModules.size());
        Assert.assertEquals(expectedModules, actualModules);
    }


    @When("the user clicks on Add Department button")
    public void theUserClicksOnAddDepartmentButton() {
        employeesPageZc.addDepartmentButton.click();
    }

    @Then("the user can add department")
    public void theUserCanAddDepartment() {
        employeesPageZc.departmentNameInputBox.sendKeys("Instructors Department");

        employeesPageZc.addButton.click();
    }

    @And("the user can see the department in the company structure system")
    public void theUserCanSeeTheDepartmentInTheCompanyStructureSystem() {
        employeesPageZc.newDepartment.isDisplayed();
    }
}
