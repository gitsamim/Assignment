package testRunner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/RegisterAccount.feature", glue="stepsDefinitions",
				
				dryRun=false,
				monochrome=true,
				plugin= {"pretty", "html:test-output"})
public class TestRunner {

}
