package com.cydeo.runners;

// We're controlling the whole project/framework from 1 place (centralized)

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                // Reports will be stored under target directory, in "cucumber-reports.html" file.
                "html:target/cucumber-reports.html",

                // Failing scenarios will be stored under target directory, in "rerun.txt" file.

                "rerun:target/rerun.txt",

                // Pretty Reports will be stored under target.cucumber directory, in "overview-features.html" file.
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        // Business layer and implementation layer are connected using: features and glue keywords.
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",

        // It provides us to execute one of the basic !steps of BDD:
        // STEP #2- Run the SCENARIOS and SCENARIOS will fail.
        // It's working like a switch: on (true) / off (false)
        dryRun = false,

        // "or", "and", "and not" can be used in the conditions.
        tags = "",

        // publish keyword creates a link for the report of the execution.
        publish = true
)
public class CukesRunner {
}

