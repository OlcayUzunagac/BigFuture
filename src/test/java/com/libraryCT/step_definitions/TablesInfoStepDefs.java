package com.libraryCT.step_definitions;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TablesInfoStepDefs {



    @Given("The table should have following column {string}")
    public void the_table_should_have_following_column(String string) {
       LoginStepDefs loginStepDefs = new LoginStepDefs();
       loginStepDefs.the_user_is_on_the_login_page();
       loginStepDefs.the_user_enters_the_student_information();
        BrowserUtils.waitFor(2);

        List<WebElement> headers = Driver.get().findElements(By.xpath("(//th[@data-name])/parent::*"));
        System.out.println("headers.size() = " + headers.size());
        List<String> actualInfo = new ArrayList<>();
        for (WebElement header:headers) {
            actualInfo.add(header.getText());

        }
        System.out.println("actualInfo = " + headers.toString());
        //Assert.assertTrue(actualInfo.contains(string));

    }
    public int getNumberOfColumn(){

        List<WebElement> allColumnWithHeader = Driver.get().findElements(By.xpath("(//th/th[@data-name])"));
        return allColumnWithHeader.size();
    }


}
