package com.bluecrm.pages;

import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TODO : Locate lef menu items as list?
//    @FindBy(css = "span.title-level-1")
//    public List<WebElement> menuOptions;

    @FindBy(id = "pagetitle")
    public WebElement pageSubTitle;

    //updated
    @FindBy(id = "user-name")
    public WebElement userName;

    //updated
    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    //updated
    @FindBy(linkText = "My Profile")
    public WebElement myProfile;





//    /**
//     * This method will navigate user to the specific module in vytrack application.
//     * For example: if tab is equals to Activities, and module equals to Calls,
//     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
//     *
//     * @param tab
//     * @param module
//     */
//    public void navigateToModule(String tab, String module) {
//        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
//        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
//        try {
//            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
//            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
//            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
//        } catch (Exception e) {
//            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
//        }
//        try {
//            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
//            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
//            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
//            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
//        } catch (Exception e) {
////            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
//            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
//        }
//    }

}
