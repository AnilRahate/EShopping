package eshopping.automation.stepDefinitions;

import eshopping.automation.modal.Products;
import eshopping.automation.pageObjects.CartPage;
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
public class CartPageSteps {
    
    private CartPage cartPage = new CartPage();

    @Given("^verify cart section is displayed$")
	public void verifyCartSectionDisplayed() throws Throwable {
		Assert.assertTrue(cartPage.getCartSection().isDisplayed(), "Cart Section is not displayed");
	}
	
    @Given("^I click on checkout button$")
   	public void clickCheckoutButton() throws Throwable {
   		cartPage.clickCheckoutButton();
   	}
	
}
