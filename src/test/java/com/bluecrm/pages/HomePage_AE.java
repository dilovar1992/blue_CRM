package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_AE extends BasePage {

    //list of profile menu pop-up items
    @FindBy(xpath = "//div[@id='popup-window-content-menu-popup-user-menu']//div[@class='menu-popup-items']/*")
    public List<WebElement> profileMenuItems;

    //iframe element, must switch to frame
    @FindBy(css = "div#bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm>iframe")
    public WebElement messageIframe;

    @FindBy (css = "body[contenteditable = true]")
    public WebElement messageInputBox;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement collapsedMessageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement messageSubmitButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement messageCancelButton;

    @FindBy(xpath = "(//div[contains(@id, 'blog_post_body')])[1]")
    public WebElement topFeedMessege;

    @FindBy(css = "div.b24-app-block.b24-app-desktop>div.b24-app-block-header")
    public WebElement mobileAppsHeader;

    @FindBy(xpath = "//div[.='My Tasks']")
    public WebElement myTasksWidgetHeader;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a")
    public List<WebElement> desktopClients;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]/a")
    public List<WebElement> mobileClients;

    @FindBy(css = "div.sidebar-widget-item-wrap>a>span.task-item-text")
    public List<WebElement> myTasksWidgetOptions;




    public WebElement getWidget(String widgetTitle){

        widgetTitle = widgetTitle.toUpperCase();
        String first = ""+widgetTitle.charAt(0);

        widgetTitle = widgetTitle.toLowerCase();

        widgetTitle = widgetTitle.replaceFirst(String.valueOf(widgetTitle.charAt(0)),first);

        String locator = "//div[@id='sidebar']//div[.='"+widgetTitle+"']";

        //locate and return
        return Driver.getDriver().findElement(By.xpath(locator));
    }
}
