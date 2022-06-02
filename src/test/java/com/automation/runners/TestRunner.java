package com.automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"com.automation.step_definitions"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/cucumber-TestReport.json",
                "junit:target/cucumber-reports/cucumber-TestReport.xml",
                "rerun:target/cucumber-reports/rerun.txt"},


        dryRun = false,
        tags = "@testo"
)


public class TestRunner extends AbstractTestNGCucumberTests{

}
