package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_BasePage {

    public WT_BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//tr/td")
    public WebElement firstRowName;

    public static void verify_URL_Contains(String snipped) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(snipped));
    }

}
