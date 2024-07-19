package com.cydeo.step_definitions;

import com.cydeo.pages.YouTubeHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTube_StepDefinitions {

    YouTubeHomePage youTubeHomePage = new YouTubeHomePage();
    Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));

    @Given("User is on the YouTube home page")
    public void user_is_on_the_youtube_home_page() {
        Driver.getDriver().get("https://www.youtube.com/");
    }

    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        BrowserUtils.verifyTitle("YouTube");
    }


    @When("User types Chicken in The Corn in the search box")
    public void user_types_chicken_in_the_corn_in_the_search_box() {
        youTubeHomePage.searchBox.sendKeys("Chicken in The Corn");
    }

    @When("User clicks to YouTube search button")
    public void user_clicks_to_youtube_search_button() {
        youTubeHomePage.searchButton.click();
    }

    @Then("User sees Chicken in The Corn is in the title")
    public void user_sees_chicken_in_the_corn_is_in_the_title() {
        wait.until(ExpectedConditions.titleContains("Chicken in The Corn"));
        Assert.assertEquals("Chicken in The Corn - YouTube", Driver.getDriver().getTitle());
    }


    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String keyword) {
        youTubeHomePage.searchBox.sendKeys(keyword);
    }

    @Then("User sees {string} is in the title")
    public void user_types_in_the_title(String expectedTitle) {
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

}
