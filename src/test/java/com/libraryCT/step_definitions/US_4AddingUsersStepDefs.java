package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class US_4AddingUsersStepDefs {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage=new UsersPage();

    @When("the user clicks Users and enters the page")
    public void the_user_clicks_Users_and_enters_the_page() {

    loginPage.users.click();

    Assert.assertEquals("User Management",usersPage.title.getText());
    }

    @When("the user clicks Add User")
    public void the_user_clicks_Add_User() {
        usersPage.addUser.click();

    }

    @When("the user fills out user information and creates a user")
    public void the_user_fills_out_user_information_and_creates_a_user() {
        Random random=new Random();
        String randomMail ="a"+random.nextInt(1000)+"@gmail.com";

      usersPage.fullName.sendKeys("John Doe");
      usersPage.password.sendKeys("123");
      usersPage.email.sendKeys(randomMail);

      usersPage.saveChanges.click();
      //if somehow same email is entered, a new randommail will be generated
      while(usersPage.fullName.isDisplayed()) {
          usersPage.email.clear();
          randomMail ="a"+random.nextInt(1000)+"@gmail.com";
          usersPage.email.sendKeys(randomMail);
          usersPage.saveChanges.click();
          BrowserUtils.waitFor(2);

          //verify user adding
          String lastAddedMail = usersPage.lastAddedMail.getText();
          Assert.assertEquals(randomMail,lastAddedMail);

      }




    }




}
