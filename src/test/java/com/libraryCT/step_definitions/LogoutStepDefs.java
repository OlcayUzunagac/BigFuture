package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("the user click his name and logout")
    public void the_user_click_his_name_and_logout() {
        BrowserUtils.waitForVisibility(loginPage.userName,15);
        loginPage.logOut();   }

    @Then("the user should be on login page")
    public void the_user_should_be_on_login_page() {
        String expectedUrl = "http://library2.cybertekschool.com/login.html";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);   }
}
