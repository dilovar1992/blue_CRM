package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;

    @FindBy(id = "USER_REMEMBER")
    public WebElement checkBox;
    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassLink;
    @FindBy(xpath = "//div[.='Get Password']")
    public WebElement getPasswordHeader;
    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMe;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }

}
