package com.cydeo.runners;

// We're controlling the whole project/framework from 1 place (centralized)

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Business layer and implementation layer are connected using: features and glue keywords.
        features = "@target/rerun.txt",
        glue = "com/cydeo/step_definitions"
)

public class FailedTestRunner {
}
