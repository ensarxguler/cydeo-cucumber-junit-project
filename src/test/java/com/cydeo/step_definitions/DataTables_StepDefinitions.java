package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.cydeo.utilities.Driver;
import com.cydeo.pages.DropdownsPage;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("user should see below list of fruits and vegetables")
    public void user_should_see_below_list_of_fruits_and_vegetables(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));
    }

    @Then("I will share my favorites")
    public void i_will_share_my_favorites(List<String> petTypes) {
        petTypes.forEach(System.out::println);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));
        System.out.println("driverInfo.size() = " + driverInfo.size());
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        // MY WAY
        /* Select monthDropdown = new Select(dropdownsPage.monthDropdown);

        for (int i = 0; i < monthDropdown.getOptions().size(); i++) {
            Assert.assertEquals("Dropdown options verification is FAILED!!!", monthDropdown.getOptions().get(i).getText(), expectedMonths.get(i));
        }*/
        
        List<String> actualMonths = BrowserUtils.dropdownOptions_as_STRING(dropdownsPage.monthDropdown);
        
        Assert.assertEquals(expectedMonths, actualMonths);
    }

}
