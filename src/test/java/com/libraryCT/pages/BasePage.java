package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "li.nav-item")
    public List<WebElement> modules;

    @FindBy(xpath = "//*[.='Books']")
    public WebElement books;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooks;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement users;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement pageTitle;

    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;

    @FindBy(css = "#navbarDropdown > span")
    public WebElement userName;

    @FindBy(id = "book_categories")
    public List<WebElement> bookCategories;

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getUserName(){
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void logOut(){
        //BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }


}
