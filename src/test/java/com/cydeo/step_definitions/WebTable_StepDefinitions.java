package com.cydeo.step_definitions;

import com.cydeo.pages.WT_BasePage;
import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {

    WT_LoginPage wtLoginPage = new WT_LoginPage();
    WT_BasePage wtBasePage = new WT_BasePage();
    WT_OrderPage wtOrderPage = new WT_OrderPage();

    @Given("User is on the login page of Web Table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }


    @When("User enters correct credentials")
    public void user_enters_correct_credentials() {
        wtLoginPage.login();
    }

    @Then("User should see URL contains orders")
    public void user_should_see_url_contains_orders() {
        WT_BasePage.verify_URL_Contains("orders");
    }


    @When("User enters correct {string} for username")
    public void user_enters_correct_username(String username) {
        wtLoginPage.username.sendKeys(username);
    }

    @And("User enters correct {string} for password")
    public void user_enters_correct_password(String password) {
        wtLoginPage.password.sendKeys(password + Keys.ENTER);
    }

    @Then("User should see URL contains {string}")
    public void user_should_see_url_contains(String snippedOfURL) {
        WT_BasePage.verify_URL_Contains(snippedOfURL);
    }


    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> usernameAndPassword) {
        wtLoginPage.username.sendKeys(usernameAndPassword.get("username"));
        wtLoginPage.password.sendKeys(usernameAndPassword.get("password") + Keys.ENTER);
    }

    @When("User is on the Order page")
    public void user_is_on_the_order_page() {
        wtBasePage.orderButton.click();
    }


    @Then("User sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> options) {
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(wtOrderPage.productDropdown);

        Assert.assertEquals(options, actualOptions);
    }


    @When("User sees below radio buttons enabled for Visa, MasterCard and American Express")
    public void user_sees_below_radio_buttons_enabled_for_visa_mastercard_and_american_express() {
        Assert.assertTrue(wtOrderPage.visaButton.isEnabled());
        Assert.assertTrue(wtOrderPage.masterCardButton.isEnabled());
        Assert.assertTrue(wtOrderPage.americanExpressButton.isEnabled());
    }

    @Then("User sees below radio button texts")
    public void user_sees_below_radio_button_texts(List<String> expectedRadioButtons) {
        List<String> actualRadioButtons = new ArrayList<>();

        for (WebElement eachButton : Driver.getDriver().findElements(By.xpath("//label[@class='radio']"))) {
            actualRadioButtons.add(eachButton.getText());
        }

        Assert.assertEquals(expectedRadioButtons, actualRadioButtons);
    }


    @When("User selects {string} product")
    public void user_selects_money_cog_product(String visibleText) {
        Select select = new Select(wtOrderPage.productDropdown);
        select.selectByVisibleText(visibleText);
    }

    @And("User enters {int} quantity")
    public void user_enters_quantity(int quantity) {
        // It's a handy method to clear the WebElements accepting insertion from the user such as <textarea> or <input>.
        // wtOrderPage.quantityInput.clear();

        wtOrderPage.quantityInput.sendKeys(Keys.BACK_SPACE + String.valueOf(quantity));
    }

    @And("User enters {string} customer name")
    public void user_enters_name_SO(String name) {
        wtOrderPage.customerName.sendKeys(name);
    }

    @And("User enters {string} street")
    public void user_enters_street_SO(String street) {
        wtOrderPage.streetName.sendKeys(street);
    }

    @And("User enters {string} city")
    public void user_enters_city_SO(String city) {
        wtOrderPage.cityName.sendKeys(city);
    }

    @And("User enters {string} state")
    public void user_enters_state_SO(String state) {
        wtOrderPage.stateName.sendKeys(state);
    }

    @And("User enters {int} zip code")
    public void user_enters_zip_code(Integer zipCode) {
        wtOrderPage.zipCode.sendKeys(zipCode.toString());
    }

    @When("User choose {string} payment option")
    public void user_choose_card_type(String cardType) {
        // Clicked to the radio button with the created util method
        WT_OrderPage.clickRadioButton(wtOrderPage.cardTypes, cardType);
    }

    @And("User enters {long} card number")
    public void user_enters_card_number(Long cardNumber) {
        wtOrderPage.cardNo.sendKeys(cardNumber.toString());
    }

    @And("User enters {string} expiry date")
    public void user_enters_expiry_date(String expiryDate) {
        wtOrderPage.cardExp.sendKeys(expiryDate);
    }

    @When("User clicks to Process Order")
    public void user_clicks_to_process_order() {
        wtOrderPage.processOrderButton.click();
    }

    @Then("User should see new order in the table with {string} on View all orders page")
    public void user_should_see_new_order_in_the_table_with_customer_name_on_view_all_orders_page(String customerName) {
        Assert.assertEquals(customerName, wtBasePage.firstRowName.getText());
    }


    @When("User enters {string} quantity")
    public void user_enters_quantity(String quantity) {
        wtOrderPage.quantityInput.sendKeys(Keys.BACK_SPACE + quantity);
    }

    @When("User enters {string} zip code")
    public void user_enters_zip_code(String zipCode) {
        wtOrderPage.zipCode.sendKeys(zipCode);
    }

    @When("User enters {string} card number")
    public void user_enters_card_number(String cardNumber) {
        wtOrderPage.cardNo.sendKeys(cardNumber);
    }

}
