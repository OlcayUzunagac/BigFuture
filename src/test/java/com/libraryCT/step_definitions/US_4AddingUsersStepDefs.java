package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.sql.SQLOutput;
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
       BrowserUtils.waitForVisibility(usersPage.addUserFormHeader,3);
        Assert.assertEquals("Add User", usersPage.addUserFormHeader.getText());

    }

    @When("the user fills out user information and creates a user")
    public void the_user_fills_out_user_information_and_creates_a_user() {
        Random random=new Random();
        String randomMail ="NEW_USER"+random.nextInt(1000)+"@gmail.com";

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
          BrowserUtils.waitFor(1);

          //verify user adding
          String lastAddedMail = usersPage.lastAddedMail.getText();
          Assert.assertEquals(randomMail,lastAddedMail);

      }

    }
    @Then("the user clicks Close and cancels the process")
    public void the_user_clicks_Close_and_cancels_the_process() {
        usersPage.close.click();
        boolean flag=true;
       try {
           usersPage.pageTitle.click();
        //if it is clickable that means Add user form is closed
       }
       catch (Exception e){
           flag=false;
       }

        Assert.assertTrue(flag);



    }

    @When("the user clicks edit user and edits the user info")
    public void the_user_clicks_edit_user_and_edits_the_user_info() {
    String xpathOfEdit="//a[@onclick='Users.edit_user("+usersPage.findFirstEditButton()+")']";
    Driver.get().findElement(By.xpath(xpathOfEdit)).click();
    BrowserUtils.waitFor(2);

        usersPage.editUsersEmail.clear();

        Random random=new Random();
        String randomMail ="Edited_User"+random.nextInt(1000)+"@gmail.com";
        usersPage.editUsersEmail.sendKeys(randomMail);
    }



    @Then("the user can {string} the edited user info")
    public void the_user_can_the_edited_user_info(String action) {
        if(action.equalsIgnoreCase("save")){
            usersPage.saveChanges.click();
            boolean flag=true;
            try {
                usersPage.pageTitle.click();
                //if it is clickable that means Edituser form is closed
            }
            catch (Exception e){
                flag=false;

            }
            BrowserUtils.waitFor(2);

            Assert.assertTrue(flag);
        }
        else if(action.equalsIgnoreCase("close")){
            usersPage.close.click();
            boolean flag=true;
            try {
                usersPage.pageTitle.click();
                //if it is clickable that means Add user form is closed
            }
            catch (Exception e){
                flag=false;
            }
            BrowserUtils.waitFor(2);
            Assert.assertTrue(flag);
        }


    }







}
