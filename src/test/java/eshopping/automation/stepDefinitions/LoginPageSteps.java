package eshopping.automation.stepDefinitions;

import eshopping.automation.modal.Products;
import eshopping.automation.pageObjects.CartPage;
import eshopping.automation.pageObjects.LoginPage;
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
public class LoginPageSteps {
    
    private LoginPage loginPage = new LoginPage();

    @Given("^I login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void loginWithCredential(String username, String password) throws Throwable {
    	loginPage.login(username, password);
	}
	
	
}
