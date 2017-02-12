package eshopping.automation.support;

import java.io.File;

import javax.swing.JOptionPane;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import eshopping.automation.base.TestBase;
import eshopping.automation.support.GenerateReport;

public class RunnerSupport{
	WebDriver driver = TestBase.driver;
	String browserName = null;
	@BeforeTest
	public void ttt(ITestContext context){
		System.clearProperty("browser");
		browserName  =  context.getCurrentXmlTest().getParameter("browser");
		System.setProperty("browser", browserName);
	}
	@AfterMethod
	public void beforeM(){
		
	}
	@AfterTest
	public void teardown(){
		
	}
	
	@BeforeSuite
	public void beforesuite(){
		//deleteAllJsonReportFiles(new File("target/json-report"));
	}
	
	@AfterSuite
	public void aftersuite(){
		//GenerateReport.GenerateMasterthoughtReport();
		
	}
	
	/**
	 * It deletes all report related json file before suite starts
	 */
	public void deleteAllJsonReportFiles(final File folder){
		for (final File file : folder.listFiles()) {
            if (!file.isDirectory()) {
              file.delete();
            }
        }
	}
}
