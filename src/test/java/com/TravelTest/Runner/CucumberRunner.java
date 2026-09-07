package com.TravelTest.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="ScenarioInFeatureFormat",
glue = {"com.TravelTest.cucumberStepDefiniation"},
plugin = "html:./test-output/CucumberReport.html",dryRun = false,tags = 
"@smoke")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
