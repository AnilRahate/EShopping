package eshopping.automation.stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import eshopping.automation.base.TestBase;


public class stepsSupport {
	
	@Before
	public void beforeSupport(Scenario scenario){
		
	}
	
	@After
	public void closebrowser() throws Exception{
		//TestBase.driver.manage().deleteAllCookies();
		TestBase.driver.quit();
		TestBase.driver =  null;
		
	}
	
}
