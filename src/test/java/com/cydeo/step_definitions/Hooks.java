package com.cydeo.step_definitions;

// In this class we will be able to create "pre" and "post" condition 
// for ALL the SCENARIOS and even STEPS

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // Import the @Before coming from the io.cucumber.java
    @Before(order = 1)
    public void setupMethod() {
        System.out.println("--> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /* @Before (value = "@login", order = 2)
    public void login_scenario_before() {
        System.out.println("--> @Before: RUNNING BEFORE EACH SCENARIO HAVING/UNDER @login TAG");
    }*/

    // @After will be executed after every SCENARIO in the framework.
    @After
    public void tearDownMethod(Scenario scenario) {

        if (scenario.isFailed()) {
            /*byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());*/

            scenario.attach(((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        }
        
        Driver.closeDriver();
        System.out.println("--> @After: RUNNING AFTER EACH SCENARIO");

    }

    /* @BeforeStep
    public void setupStep() {
        System.out.println("--> @BeforeStep: RUNNING BEFORE EACH STEP");
    }*/

    /* @AfterStep
    public void tearDownStep() {
        System.out.println("--> @AfterStep: RUNNING AFTER EACH STEP");
    }*/

}
