package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on the Google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    
    
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        BrowserUtils.verifyTitle("Google");
    }


    @When("user searches for {word}")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter(String word) {
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);
    }

    @Then("user should see {word} in the title")
    public void user_sees_apple_in_page_title(String word) {
        String expectedTitle = word + " - Google'da Ara";
        BrowserUtils.verifyTitle(expectedTitle);
    }
    
    /* @And("user sees {int} {word}s")
    public void userSeesIntApples(int num, String word) {
        System.out.println("user sees " + num + " " + word + "s" );
    }*/
    
}
