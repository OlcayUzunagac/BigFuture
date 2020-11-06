package com.libraryCT.step_definitions;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("the user enters the student information")
    public void the_user_enters_the_student_information() {
        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the librarian information")
    public void the_user_enters_the_librarian_information() {
        String username2 = ConfigurationReader.get("librarian_username");
        String password2 = ConfigurationReader.get("librarian_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username2,password2);
    }


    @When("the user enters an invalid information")
    public void the_user_enters_an_invalid_information() {
      String invalidUsername = ConfigurationReader.get("invalid_username");
      String invalidPassword = ConfigurationReader.get("invalid_password");
      LoginPage loginPage = new LoginPage();
      loginPage.login(invalidUsername,invalidPassword);
    }

    @Then("the user is on {string} page")
    public void the_user_is_on_page(String string) {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(string,actualTitle);
    }

    @Then("the user is {string} page")
    public void the_user_is_page(String string) {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(string,actualTitle);
    }

}