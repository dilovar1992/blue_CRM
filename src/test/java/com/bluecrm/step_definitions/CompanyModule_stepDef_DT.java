package com.bluecrm.step_definitions;

import com.bluecrm.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.testng.*;

import java.util.*;

public class CompanyModule_stepDef_DT {
    CompanyModulePage_TD company = new CompanyModulePage_TD();

    @When("user click on Company link under the Activity Stream menu")
    public void user_click_on_company_link_under_the_activity_stream_menu() {
        company.companyLink.click();
    }

    @Then("user should be able to see  below modules")
    public void user_should_be_able_to_see_below_modules(List<String> expectedModules) {
        List<String> actualModules=new ArrayList<>();
        for (WebElement module : company.allModules) {
            actualModules.add(module.getText());
        }
        Assert.assertEquals(actualModules,expectedModules);
    }
}
