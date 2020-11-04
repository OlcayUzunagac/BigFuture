package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("I am logged in as {string}")
    public void i_am_logged_in_as(String userType) {

        String url = ConfigurationReader.get("url");
        String studentUsername = ConfigurationReader.get("student_username");
        String studentPassword = ConfigurationReader.get("student_password");
        String librarianUsername = ConfigurationReader.get("librarian_username");
        String librarianPassword = ConfigurationReader.get("librarian_password");

        Driver.get().get(url);

        if (userType.equals("Student")) {
            loginPage.login(studentUsername,studentPassword);
        } else if (userType.equals("Librarian")) {
            loginPage.login(librarianUsername,librarianPassword);
        }

        BrowserUtils.waitFor(2);
    }

    @When("I click on log out button")
    public void i_click_on_log_out_button() {
        loginPage.logOut();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        //String actualTitle = loginPage.getTitle();
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
