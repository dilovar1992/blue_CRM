package com.bluecrm.step_definitions;

import com.bluecrm.pages.HomePage_AE;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import java.util.Map;

public class PollFeature_stepDef_AE {
    HomePage_AE homePage = new HomePage_AE();
    Map<String,String> pollInfo;

    @When("the user clicks on POLL tab")
    public void the_user_clicks_on_poll_tab() {
        BrowserUtils.waitForPageToLoad(2);
        homePage.pollTab.click();
    }
    @When("the user enters the following poll information")
    public void the_user_enters_the_following_poll_information(Map<String,String> pollInfo) {
        this.pollInfo = pollInfo;

        //message body is inside an iframe
        homePage.addMessageToFrame(homePage.messageIframe, pollInfo.get("Title"));
        homePage.questionInputBox.sendKeys(pollInfo.get("Question"));
        homePage.answer1InputBox.sendKeys(pollInfo.get("Answer 1"));
        homePage.answer2InputBox.sendKeys(pollInfo.get("Answer 2"));
    }
    @Then("user sees the poll content on top of the feed")
    public void user_sees_the_poll_content_on_top_of_the_feed() {
        //confirm title content as expected
        BrowserUtils.waitFor(2);
        Assert.assertEquals(homePage.topFeedMessege.getText(),pollInfo.get("Title"), "The message on top of the feed is NOT AS EXPECTED");

        //to get sessionID
        //SessionId sessionId = ((RemoteWebDriver) Driver.getDriver()).getSessionId();

    }
}
