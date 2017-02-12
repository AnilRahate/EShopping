package eshopping.automation.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import eshopping.automation.modal.Products;
import eshopping.automation.pageObjects.HomePage;
import gherkin.formatter.model.DataTableRow;

/**
 * Home Page steps 
 * @author 
 *
 */
public class HomePageSteps {
    
    private HomePage homePage = new HomePage();
    List<WebElement> list = new ArrayList<WebElement>();
    List<WebElement> submenuList = new ArrayList<WebElement>();
    
	 
	@Given("^I am at the homepage$")
	public void launchHomePage() throws Throwable {
		homePage.launchPage();
	}
	
	@Given("^verify the logo on navigation bar$")
	public void verifyLogo() throws Throwable {
		homePage.verifyLogoOnPage();
	}
	
	@Given("^I hover on (.*)$")
	public void hoverOnNavBarMenu(String menu) throws Throwable {
		this.list = homePage.getNavigationMenuList();
		for(WebElement ele: list){
			if(ele.getText().trim().equalsIgnoreCase(menu.trim())){
				homePage.getActions().moveToElement(ele).build().perform();
				submenuList = ele.findElements(By.cssSelector(".dropdown-menu>li>a"));
				//homePage.doWait(ExpectedConditions.attributeContains(ele.findElement(By.cssSelector(">ul")), "style", "display: none;"));
			}
		}
		
	}
	
	@Given("^I see below dropdown list$")
	public void verifyDropdownListItems(DataTable table) throws Throwable {
		
		for(int i=1;i<table.getGherkinRows().size();i++){
			DataTableRow row = table.getGherkinRows().get(i);
				String actual = submenuList.get(i-1).getText().trim();
				String expected = row.getCells().get(0).trim();
				Assert.assertEquals(actual,expected , String.format("verification fails for matching '%s' with '%s'",actual, expected ));
		  
		}
	}
	
	@Given("^verify list of products is displayed$")
	public void verifyProductListDisplayed() throws Throwable {
		Assert.assertTrue(homePage.verifyProductListDisplayed(), "Products are not displayed");
	}
	
	@Given("^verify image is displayed for each product$")
	public void verifyProductImageIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductImage(products.getProductByIndex(i)).isDisplayed(), "Product's image is not displayed");
		}
	}
	@Given("^verify title is displayed for each product$")
	public void verifyTitleIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductTitle(products.getProductByIndex(i)).isDisplayed(), "Product's title is not displayed");
		}
	}
	@Given("^verify manufacturer is displayed for each product$")
	public void verifyManufacturerIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductManufacturer(products.getProductByIndex(i)).isDisplayed(), "Product's Manufacturer is not displayed");
		}
		
	}
	@Given("^verify description is displayed for each product$")
	public void verifyDescriptionIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductDescription(products.getProductByIndex(i)).isDisplayed(), "Product's Description is not displayed");
		}
			
	}
	@Given("^verify price is displayed for each product$")
	public void verifyPriceIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductPrice(products.getProductByIndex(i)).isDisplayed(), "Product's price is not displayed");
		}
	}
	@Given("^verify add to cart button is displayed for each product$")
	public void verifyAddToCartButtonIsDisplayed() throws Throwable {
		Products products = homePage.getProducts();
		for(int i=0;i<products.getProductList().size();i++){
			homePage.getActions().moveToElement(products.getProductByIndex(i)).build().perform();
		Assert.assertTrue(products.getProductAddToCartButton(products.getProductByIndex(i)).isDisplayed(), "Product's AddCart Button is not displayed");
		}
	}
	
	@Given("^I add product number (\\d+) to cart$")
	public void addToCart(int num) throws Throwable {
		Products products = homePage.getProducts();
		homePage.getActions().moveToElement(products.getProductByIndex(num-1)).build().perform();
		products.getProductAddToCartButton(products.getProductByIndex(num-1)).click();
	}
}
