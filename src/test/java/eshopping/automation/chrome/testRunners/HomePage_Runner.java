package eshopping.automation.chrome.testRunners;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "Features/homepage.feature", 
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/json-report/home-page-cucumber-json-report-chrome.json"},
		glue = "eshopping.automation.stepDefinitions",
		tags = {"@homePage"}
		)

public class HomePage_Runner extends AbstractTestNGCucumberTests {
	
}

