package com.bluecrm.step_definitions;

import com.bluecrm.pages.HomePage_AE;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SendMessage_stepDef_AE {
    HomePage_AE homePage = new HomePage_AE();
    String expectedMessage;


    @Given("clicks message input box")
    public void clicks_message_input_box() {
        homePage.collapsedMessageBox.click();
    }

    @Given("enters a {string} message")
    public void enters_a_message(String expectedMessage) {
        Driver.getDriver().switchTo().frame(homePage.messageIframe);
        homePage.messageInputBox.clear();
        homePage.messageInputBox.sendKeys(expectedMessage);
        Driver.getDriver().switchTo().defaultContent();

    }

    @Given("clicks submit button")
    public void clicks_submit_button() {
        homePage.messageSubmitButton.click();
    }

    @Then("user sees message on top of the feed")
    public void user_sees_message_on_top_of_the_feed() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(homePage.topFeedMessege.getText(),expectedMessage, "The message on top of the feed is NOT AS EXPECTED");
    }

    @Given("clicks cancel button")
    public void clicks_cancel_button() {
        homePage.messageCancelButton.click();
    }

    @Then("user should see message area collapse")
    public void user_should_see_message_area_collapse() {
        Assert.assertTrue(homePage.collapsedMessageBox.isDisplayed(),"Message input box is not in the collapsed form");
    }

}
