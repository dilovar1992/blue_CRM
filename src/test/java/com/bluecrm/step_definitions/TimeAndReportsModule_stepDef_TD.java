package com.bluecrm.step_definitions;

import com.bluecrm.pages.TimeAndReportsPage_TD;
import com.bluecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class TimeAndReportsModule_stepDef_TD {
    TimeAndReportsPage_TD TRpage=new TimeAndReportsPage_TD();
    @When("Users click on {string} link under the {string} menu")
    public void users_click_on_link_under_the_menu(String TimeReports, String ActivityStream) {
        BrowserUtils.waitForPageToLoad(3);
        TRpage.TimeAndReports.click();

    }
    @Then("User sees {int} modules above {string} header")
    public void user_sees_modules_above_header(Integer numberOfModule, String expectedHeader) {

        List<WebElement> allModules = TRpage.AllModules;
        Assert.assertEquals(allModules.size(),numberOfModule);
        Assert.assertEquals(expectedHeader,TRpage.AbsenceChartHeader.getText());

    }

    @When("Users click on {string} module")
    public void users_click_on_module(String workTime) {
        Assert.assertEquals(workTime,TRpage.worktimeModule.getText());
        TRpage.worktimeModule.click();

    }
    @Then("Users should see {string} and {string} checkboxes")
    public void users_should_see_and_checkboxes(String statistics, String StartAndEnd) {
        Assert.assertTrue(TRpage.StatsCheckBox.isDisplayed());
        Assert.assertTrue(TRpage.startAndEndCheckBox.isDisplayed());


    }


    @Then("User sees {string} checkbox is selected")
    public void user_sees_checkbox_is_selected(String statistics ) {
        Assert.assertTrue(TRpage.StatsCheckBox.isSelected());

    }

}
