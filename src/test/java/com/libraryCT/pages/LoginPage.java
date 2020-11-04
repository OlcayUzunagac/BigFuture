package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "#inputEmail")
    public WebElement emailAddress;

    @FindBy(css = "#inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signIn;

    public void login(String userNameStr, String passwordStr) {
        emailAddress.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        signIn.click();

    }

}
