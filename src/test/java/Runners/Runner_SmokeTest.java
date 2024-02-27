package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty", "json:target/cucumber.json",},
        features = "src/test/resources/featureFiles",
        glue = "StepDefinitions",
        tags = "@SmokeTest",
        dryRun = false
)
public class Runner_SmokeTest extends AbstractTestNGCucumberTests {

}



