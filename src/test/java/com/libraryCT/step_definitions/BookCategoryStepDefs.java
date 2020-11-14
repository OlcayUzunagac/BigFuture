package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BookCategoryStepDefs {
    @Then("The user should able to search books with Categories")
    public void the_user_should_able_to_search_books_with_Categories(List<String> expectedCategories) {
        BrowserUtils.waitFor(2);
        List<String> actualCategories = BrowserUtils.getElementsText(new UsersPage().bookCategories);
        System.out.println("actualCategories = " + actualCategories);
        System.out.println("expectedCategories = " + expectedCategories);

        //Assert.assertTrue(expectedCategories.contains(actualCategories));

    }


}
