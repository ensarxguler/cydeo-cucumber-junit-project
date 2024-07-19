package com.cydeo.pages;

import org.openqa.selenium.support.PageFactory;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownsPage {

    public DropdownsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;

}
