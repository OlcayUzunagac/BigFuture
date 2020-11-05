package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//section[@id='users']//div//h3")
    public WebElement title;

    @FindBy(xpath = "(//section[@id='users']//div//a)[1]")
    public WebElement addUser;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//button[.='Close']")
    public WebElement close;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChanges;

    @FindBy(xpath = "//span[@id='email-error']")
    public WebElement mailErrorMessage;


    @FindBy(xpath = "(//tbody//td)[4]")
    public WebElement lastAddedMail;

    @FindBy(css = "div#add_user_modal h5")
    public WebElement addUserFormHeader;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement editUsersEmail;



    public String findFirstEditButton(){
        String firstEditRowNum = Driver.get().findElement(By.xpath("(//tbody//td)[2]")).getText();
        return firstEditRowNum;
    }

}
