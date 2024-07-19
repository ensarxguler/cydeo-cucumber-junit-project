package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeHomePage {

    public YouTubeHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#search")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@aria-label='Search'])[1]")
    public WebElement searchButton;

}
