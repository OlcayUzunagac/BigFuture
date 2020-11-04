package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccessingModulesStepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("the user see {string} {string}")
    public void the_user_see(String module1, String module2) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(module1,loginPage.books.getText());
        Assert.assertEquals(module2,loginPage.borrowingBooks.getText()); }

    @Then("the user see {string} {string} {string}")
    public void the_user_see(String module1, String module2, String module3) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(module1,loginPage.dashboard.getText());
        Assert.assertEquals(module2,loginPage.users.getText());
        Assert.assertEquals(module3,loginPage.books.getText()); }


}
