package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing page")
    public void user_is_on_the_bing_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }


    @When("user enters orange in the Bing search box")
    public void user_types_apple_in_the_bing_search_box_and_clicks_enter() {
        bingSearchPage.rejectBtnForPopUp.click();
        bingSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user should see orange in the title")
    public void user_sees_apple_in_page_title_after_bing_search() {
        String expectedTitle = "orange" + " - Search";
        BrowserUtils.verifyTitle(expectedTitle);
    }


    @When("user enters {string} in the Bing search box")
    public void userEntersOrangeInTheBingSearchBox(String searchKey) {
        bingSearchPage.rejectBtnForPopUp.click();
        bingSearchPage.searchBox.sendKeys(searchKey + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

}
