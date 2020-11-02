package com.libraryCT.step_definitions;

import com.libraryCT.pages.BasePage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends BasePage {

    @When("user login as a <role>")
    public void user_login_as_a_role() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);




    }

    @Then("user should be on <page>")
    public void user_should_be_on_page() {

    }
}
