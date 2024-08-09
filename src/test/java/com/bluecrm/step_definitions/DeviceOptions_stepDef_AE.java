package com.bluecrm.step_definitions;

import com.bluecrm.pages.HomePage_AE;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class DeviceOptions_stepDef_AE {
    HomePage_AE homePage = new HomePage_AE();
    @Given("user scrolls down to see {string} widget")
    public void user_scrolls_down_to_see_widget(String widgetTitle) {
        BrowserUtils.waitForPageToLoad(2);

        //scroll to make widget in sidebar visible
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,350)");

        //confirm widget visible
        Assert.assertTrue(homePage.getWidget(widgetTitle).isDisplayed());

    }

    @Then("user sees following device options")
    public void user_sees_following_device_options(List<String> expectedDesktopApps) {

        List<String> actualDesktopApps = BrowserUtils.getElementsText(homePage.desktopClients);
        Assert.assertEquals(actualDesktopApps,expectedDesktopApps, "Desktop clients items are not as expected");
    }

    @Given("user sees MY TASKS widget")
    public void user_sees_my_tasks_widget() {
        BrowserUtils.waitForPageToLoad(2);
        //confirm widget visible
        Assert.assertTrue(homePage.myTasksWidgetHeader.isDisplayed());


    }
    @Then("user sees following task options")
    public void user_sees_following_task_options(List<String> expectedMyTasksOptions) {
        List<String> actualMyTasksOptions = BrowserUtils.getElementsText(homePage.myTasksWidgetOptions);
        Assert.assertEquals(actualMyTasksOptions,expectedMyTasksOptions, "My tasks items are not as expected");
    }

    @Given("user sees following mobile app stores")
    public void user_sees_following_mobile_app_stores(List<String> expectedMobileApps) {
        List<String> actualMobileApps = BrowserUtils.getElementsText(homePage.mobileClients);
        Assert.assertEquals(actualMobileApps,expectedMobileApps, "Mobile clients items are not as expected");
    }


}
