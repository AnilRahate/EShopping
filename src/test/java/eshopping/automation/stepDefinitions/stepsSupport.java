package eshopping.automation.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import eshopping.automation.base.TestBase;


public class stepsSupport {
	
	@Before
	public void beforeSupport(Scenario scenario){
		
	}
	
	@After
	public void closebrowser(Scenario scenario) throws Exception{
		//TestBase.driver.manage().deleteAllCookies();
		if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) TestBase.driver)
                        .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
    }
		if(TestBase.driver !=null){
		TestBase.driver.quit();
		TestBase.driver =  null;
		}
	}
	
}
