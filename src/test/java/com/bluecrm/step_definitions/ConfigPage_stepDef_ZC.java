package com.bluecrm.step_definitions;

import com.bluecrm.pages.ConfigPage_ZC;
import com.bluecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ConfigPage_stepDef_ZC {

    ConfigPage_ZC configPageZc = new ConfigPage_ZC();

    @When("the user clicks on CONFIGURE MENU")
    public void the_user_clicks_on_configure_menu() {

        configPageZc.configureMenu.click();

    }


    @Then("the user can see following {int} options")
    public void the_user_can_see_following_options(int expectedConfigMenuOptionsNumber, List<String> expectedConfigMenuOptions) {

        List<String> actualConfigMenuOptions = BrowserUtils.getElementsText(configPageZc.configureMenuOptions);

        Assert.assertEquals(actualConfigMenuOptions, expectedConfigMenuOptions);
        Assert.assertEquals(actualConfigMenuOptions.size(), expectedConfigMenuOptionsNumber);

    }

    @Then("the user can click following {int} options")
    public void theUserCanClickFollowingOptions(List<WebElement> expectedConfigMenuOptions) {

        for (WebElement eachOption : expectedConfigMenuOptions) {

               Assert.assertEquals(true, eachOption.isEnabled());

        }



    }
}
