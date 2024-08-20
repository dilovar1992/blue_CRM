package com.bluecrm.step_definitions;

import com.bluecrm.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.testng.AssertJUnit.*;

public class LoginPage_stepDef_DT extends LoginPage{

    @When("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedText) {
        try{
            assertEquals(rememberMe.getText(),expectedText);}
        catch (RuntimeException e){
            System.out.println("Your Test Failed");
        }
    }
    @Then("the user should be able to check the checkbox")
    public void the_user_should_be_able_to_check_the_checkbox() {
        checkBox.click();
        assertTrue(checkBox.isSelected());


    }
    @When("user clicks on {string} link")
    public void user_clicks_on_link(String expectedLinkText) {
        assertEquals(expectedLinkText,forgotPassLink.getText());
        forgotPassLink.click();


    }
    @Then("user should be able to go to {string} page")
    public void user_should_be_able_to_go_to_page(String expectedHeaderText) {
        assertEquals(expectedHeaderText,getPasswordHeader.getText());

    }
}
