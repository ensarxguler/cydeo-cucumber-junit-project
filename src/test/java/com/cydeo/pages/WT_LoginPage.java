package com.cydeo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WT_LoginPage {

    public WT_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    /**
     * This method will log in with below credentials
     * @username : Test
     * @password : Tester
     */
    public void login() {
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester" + Keys.ENTER);
    }

    /**
     * This method will log in with credentials passed in the argument section
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password + Keys.ENTER);
    }

}
