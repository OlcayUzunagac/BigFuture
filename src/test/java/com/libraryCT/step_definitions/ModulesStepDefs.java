package com.libraryCT.step_definitions;

import com.libraryCT.pages.ModulesPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ModulesStepDefs {

    @Then("Student should see following modules")
    public void student_should_see_following_modules(List<String> modules) {

        List<String> actualModules = BrowserUtils.getElementsText(new ModulesPage().modules);
        Assert.assertEquals(modules,actualModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("modules = " + modules);


    }


    @Then("Librarian should see following modules")
    public void librarian_should_see_following_modules(List<String> modules) {
        BrowserUtils.waitFor(2);

        List<String> actualModules = BrowserUtils.getElementsText(new ModulesPage().modules);
        Assert.assertEquals(modules,actualModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("modules = " + modules);
    }
}
