package eshopping.automation.pageObjects;


import java.util.List;

import javax.swing.JOptionPane;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;
import eshopping.automation.modal.Products;


/**
 * Page object model for Home page
 * @author 
 *
 */
public class HomePage extends TestBase implements HomePageLocators{
	
	@FindBy(css = logo_Loc)
	private WebElement logoImg;
	
	@FindBy(css = navigationMenu_Loc)
	private List<WebElement> navigationMenuList;
	
	@FindBy(css = "div#products")
	private WebElement productList;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * to launch base url
	 */
	public void launchPage(){
		driver.get(applicationProperties.getApplicationPropertiesObject().getProperty("baseUrl"));
		waitForPageLoad();
	}

	public void verifyLogoOnPage() {
		Assert.assertTrue(logoImg.isDisplayed(), "Logo is not displayed");
		
	}
	
	public List<WebElement> getNavigationMenuList(){
		return navigationMenuList;
	}
 
	public void moveToLogo(){
		getActions().moveToElement(logoImg);
	}

	/*public int getTotalProduct(){
		return new Products(driver, By.cssSelector("div#products div.thumbnail")).getProductList().size();
	}*/
	
	public Products getProducts(){
		Products products = new Products(driver, By.cssSelector("div#products div.thumbnail")); 
		return products;
	}
	
	public boolean verifyProductListDisplayed(){
		return productList.isDisplayed();
	}
}
