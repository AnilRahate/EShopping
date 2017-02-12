package eshopping.automation.stepDefinitions;

import eshopping.automation.modal.Products;
import eshopping.automation.pageObjects.CartPage;
import eshopping.automation.pageObjects.CheckoutPage;
import eshopping.automation.pageObjects.PaymentPage;
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
public class PaymentPageSteps {
    
    private PaymentPage paymentPage = new PaymentPage();

    @Given("^I enter \"([^\"]*)\" in card number$")
	public void enterCardNumber(String cardNumber) throws Throwable {
    	paymentPage.enterCardNumber(cardNumber);
	}
    
    @Given("^I enter \"([^\"]*)\" in name on card$")
	public void enterNameOnCard(String name) throws Throwable {
    	paymentPage.enterName(name);
	}
    
    @Given("^I enter \"([^\"]*)\" in expiry month$")
   	public void enterExpiryMonth(String month) throws Throwable {
    	paymentPage.enterExpiryMonth(month);
   	}
    
    @Given("^I enter \"([^\"]*)\" in expiry year$")
	public void enterExpiryYear(String year) throws Throwable {
    	paymentPage.enterExpiryYear(year);
	}
    
    @Given("^I enter \"([^\"]*)\" in cvv code$")
	public void enterCVVCode(String cvcode) throws Throwable {
    	paymentPage.enterCVVCode(cvcode);
	}
    
    @Given("^I click on Pay button$")
	public void clickPayButton() throws Throwable {
    	paymentPage.clickPayButton();
	}
	
}
