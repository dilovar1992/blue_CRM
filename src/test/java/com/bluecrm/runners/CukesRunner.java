package com.bluecrm.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/bluecrm/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = true //generating a report with public link
)
public class CukesRunner extends AbstractTestNGCucumberTests {}


