package com.libraryCT.step_definitions;

import com.libraryCT.pages.BasePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);  }

    @When("the user logs as a {string} with {string}")
    public void the_user_logs_as_a_with(String email , String password) {

        loginPage.emailAddress.sendKeys(email);
        loginPage.password.sendKeys(password);
        loginPage.signIn.click();  }


    @Then("the title should be {string}")
    public void the_title_should_be(String page) {
        BrowserUtils.waitForVisibility(loginPage.pageTitle,10);
        String expectedUrl = "http://library2.cybertekschool.com/#" + page.toLowerCase();
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl); }

}
