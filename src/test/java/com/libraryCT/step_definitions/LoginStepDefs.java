package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enter {string} and {string}")
    public void the_user_enter_and(String username, String password) {
        String usernameNew = null;
        String passwordNew = null;

        if (username.equals("student58@library")) {
            usernameNew = ConfigurationReader.get("student_username");
            passwordNew = ConfigurationReader.get("student_password");
        } else if (username.equals("librarian50@library")) {
            usernameNew = ConfigurationReader.get("librarian_username");
            passwordNew = ConfigurationReader.get("librarian_password");

        }

        LoginPage loginPage=new LoginPage();
        loginPage.login(usernameNew,passwordNew);




    }

}