package com.libraryCT.step_definitions;

import com.libraryCT.pages.ModulesPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ModulesStepDefs {

    @Then("Student should see following modules")
    public void student_should_see_following_modules(List<String> modules) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        //List<String> actualOptions = BrowserUtils.getElementsText(new ModulesPage().menuOptions);
        List<String> actualModuls = BrowserUtils.getElementsText(new ModulesPage().modules);
        Assert.assertEquals(modules,actualModuls);
    }
}
