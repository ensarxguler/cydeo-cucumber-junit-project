package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    //TODO: TODO EXAMPLE

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("User is on the login page of the application.");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username.");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password.");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard.");
    }

    // There's no difference between the annotations @When & @And
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username.");
    }

    // There's no difference between the annotations @When & @And.
    @And("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password.");
    }

    // Two methods below have been created using IDE shortcut.
    // It can be understood from the different naming convention.
    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username.");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin username.");
    }

}
