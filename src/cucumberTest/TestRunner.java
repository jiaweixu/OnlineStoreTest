package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		tags = {"@tag"},
		features = "Feature"
		,glue = {"stepDefinition"}
		,monochrome = true
		)
public class TestRunner {

}
