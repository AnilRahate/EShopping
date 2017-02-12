package eshopping.automation.firefox.testRunners;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "Features/E2E.feature", 
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/json-report/E2E-cucumber-json-report-firefox.json"},
		glue = "eshopping.automation.stepDefinitions",
		tags = {"@E2E"}
		)

public class E2E_Runner extends AbstractTestNGCucumberTests {
	
}

