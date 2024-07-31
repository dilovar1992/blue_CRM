package com.bluecrm.step_definitions;

import com.bluecrm.pages.HomePage_AE;
import com.bluecrm.pages.LoginPage;
import com.bluecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class Logout_stepDef_AE {
    HomePage_AE homePage = new HomePage_AE();
    @Given("user clicks profile menu")
    public void user_clicks_profile_menu() {

        homePage.userName.click();

    }

    @Then("user sees following options")
    public void user_sees_following_options(List<String> expectedMenu) {

        List<String> actualMenu = BrowserUtils.getElementsText(homePage.profileMenuItems);
        Assert.assertEquals(actualMenu,expectedMenu, "Profile menu items are not as expected");

    }

    @Then("user clicks on Log out button")
    public void user_clicks_on_log_out_button() {
        LoginPage loginPage = new LoginPage();

        homePage.logOutLink.click();

        Assert.assertTrue(loginPage.loginButton.isDisplayed());

    }
}
