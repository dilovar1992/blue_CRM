package com.bluecrm.step_definitions;

import com.bluecrm.pages.*;
import com.bluecrm.utilities.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;

public class AppreciationMessage_stepDef_DT {

    MainPage_DT main=new MainPage_DT();
    HomePage_AE home = new HomePage_AE();
    Actions actions=new Actions(Driver.getDriver());

    @When("the user chooses {string} from dropdown on the main page")
    public void the_user_chooses_from_dropdown_on_the_main_page(String appreciation) {
        //TODO String appreciation is not in use, should not parameterize or should use it somehow
        actions.moveToElement(main.MORE).pause(2000).click(main.MORE).build().perform();
        actions.click(main.appreciation).perform();
        BrowserUtils.waitFor(3);

    }

    @When("the user write the {string} on the text area")
    public void the_user_write_the_on_the_text_area(String message) {
       Driver.getDriver().switchTo().frame(home.messageIframe);
       home.messageInputBox.clear();
       home.messageInputBox.sendKeys(message);
       Driver.getDriver().switchTo().parentFrame();
    }

    @Then("the user sees {string} on the main page")
    public void the_user_sees_on_the_main_page(String expectedMessage) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(home.topFeedMessege.getText(),expectedMessage);
        System.out.println("main.displayedMessage.getText() = " + home.topFeedMessege.getText());
    }

    @Then("the user sees {string} below MESSAGE module")
    public void the_user_sees_below_message_module(String expectedSendMessageText) {
        BrowserUtils.waitForVisibility(main.sendMessageText,2);
        Assert.assertEquals(main.sendMessageText.getText(),expectedSendMessageText);

    }

}
