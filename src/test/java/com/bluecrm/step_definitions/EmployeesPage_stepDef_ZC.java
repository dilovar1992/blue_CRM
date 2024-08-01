package com.bluecrm.step_definitions;

import com.bluecrm.pages.EmployeesPage_ZC;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeesPage_stepDef_ZC {

    EmployeesPage_ZC employeesPageZc = new EmployeesPage_ZC();

    @When("users click on the Employees page")
    public void users_click_on_the_employees_page() {
        employeesPageZc.employeesPage.click();
    }


    @Then("users see following modules")
    public void users_see_following_modules() {

    }
}
