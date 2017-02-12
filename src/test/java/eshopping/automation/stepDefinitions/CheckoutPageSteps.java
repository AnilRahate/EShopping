package eshopping.automation.stepDefinitions;

import eshopping.automation.modal.Products;
import eshopping.automation.pageObjects.CartPage;
import eshopping.automation.pageObjects.CheckoutPage;
import gherkin.formatter.model.DataTableRow;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

/**
 * Cart Page steps 
 * @author 
 *
 */
public class CheckoutPageSteps {
    
    private CheckoutPage checkoutPage = new CheckoutPage();

    @Given("^I enter \"([^\"]*)\" in full name$")
	public void enterFullName(String name) throws Throwable {
		checkoutPage.enterFullName(name);
	}
    
    @Given("^I enter \"([^\"]*)\" in address1$")
	public void enterAddress1(String address1) throws Throwable {
		checkoutPage.enterAddress1(address1);
	}
    
    @Given("^I enter \"([^\"]*)\" in address2$")
   	public void enterAddress2(String address2) throws Throwable {
   		checkoutPage.enterAddress2(address2);
   	}
    
    @Given("^I enter \"([^\"]*)\" in city$")
	public void enterCity(String city) throws Throwable {
		checkoutPage.enterCity(city);
	}
    
    @Given("^I enter \"([^\"]*)\" in State$")
	public void enterState(String state) throws Throwable {
		checkoutPage.enterState(state);
	}
    
    @Given("^I enter \"([^\"]*)\" in zip code$")
	public void enterZipCode(String zipcode) throws Throwable {
		checkoutPage.enterZipCode(zipcode);
	}
    
    @Given("^I click on save address button$")
	public void clickSaveAddressButton() throws Throwable {
		checkoutPage.clickSaveAddressButton();
	}
    
    @Given("^I click on continue to payment button$")
	public void clickContinueToPaymentButton() throws Throwable {
		checkoutPage.clickContinueToPaymentButton();
	}
	
}
