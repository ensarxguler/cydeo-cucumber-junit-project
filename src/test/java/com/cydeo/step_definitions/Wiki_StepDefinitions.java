package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    WikiResultPage wikiResultPage = new WikiResultPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_keyword_in_the_wiki_search_box(String searchValue) {
        wikiSearchPage.searchBox.sendKeys(searchValue);
    }

    @And("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_keyword_is_in_the_wiki_title(String expectedTitleSnipped) {
        String expectedTitle = expectedTitleSnipped + " - Wikipedia";
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_keyword_is_in_the_main_header(String expectedHeader) {
        Assert.assertEquals("Main header verification is FAILED!!!", expectedHeader, wikiResultPage.mainHeader.getText());
    }

    @Then("User sees {string} is in the image header")
    public void User_sees_keyword_is_in_the_image_header(String expectedImageHeader) {
        Assert.assertEquals("Image header verification is FAILED!!!", expectedImageHeader, wikiResultPage.imageHeader.getText());
    }

}
