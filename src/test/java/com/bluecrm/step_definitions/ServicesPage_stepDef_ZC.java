package com.bluecrm.step_definitions;

import com.bluecrm.pages.ServicesPage_ZC;
import com.bluecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ServicesPage_stepDef_ZC {

    ServicesPage_ZC servicesPageZc = new ServicesPage_ZC();

    @When("the user clicks on Services page")
    public void the_user_clicks_on_services_page() {
        servicesPageZc.servicesPage.click();

    }



    @Then("the user can see following {int} modules")
    public void the_user_can_see_following_modules(int expectedModuleNumber, List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(servicesPageZc.servicesModules);

        Assert.assertEquals(actualModules, expectedModules);
        Assert.assertEquals(actualModules.size(), expectedModuleNumbergitgit);



    }
}
