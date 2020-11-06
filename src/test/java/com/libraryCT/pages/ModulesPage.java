package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ModulesPage extends BasePage {

    @FindBy(css = "span.title")
    public List<WebElement> modules;

}
