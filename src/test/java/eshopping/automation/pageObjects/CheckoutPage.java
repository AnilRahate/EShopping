package eshopping.automation.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;

public class CheckoutPage extends TestBase implements HomePageLocators{
	
	@FindBy(css="#fullName")
	private WebElement fullNameTxtBox;
	
	@FindBy(css="#address1")
	private WebElement address1TxtBox;
	
	@FindBy(css="#address2")
	private WebElement address2TxtBox;
	
	@FindBy(css="#city")
	private WebElement cityTxtBox;
	
	@FindBy(css="#zipCode")
	private WebElement zipCodeTxtBox;
	
	@FindBy(css="#state")
	private WebElement stateTxtBox;
	
	@FindBy(css="input[value='Save Address']")
	private WebElement saveAddressButton;
	
	public WebElement getFullNameTxtBox() {
		return fullNameTxtBox;
	}

	public WebElement getAddress1TxtBox() {
		return address1TxtBox;
	}

	public WebElement getAddress2TxtBox() {
		return address2TxtBox;
	}

	public WebElement getCityTxtBox() {
		return cityTxtBox;
	}

	public WebElement getZipCodeTxtBox() {
		return zipCodeTxtBox;
	}

	public WebElement getStateTxtBox() {
		return stateTxtBox;
	}

	public WebElement getSaveAddressButton() {
		return saveAddressButton;
	}

	public WebElement getContinueToPaymentButton() {
		return continueToPaymentButton;
	}

	@FindBy(css="a[href='payment']")
	private WebElement continueToPaymentButton;
	
	public CheckoutPage(){
		PageFactory.initElements(driver, this);
	}

	public void enterFullName(String name){
		getFullNameTxtBox().clear();
		getFullNameTxtBox().sendKeys(name);
	}
	
    public void enterAddress1(String address1){
    	getAddress1TxtBox().clear();
		getAddress1TxtBox().sendKeys(address1);
	}

    public void enterAddress2(String address2){
		getAddress2TxtBox().clear();
		getAddress2TxtBox().sendKeys(address2);
	}
    
    public void enterCity(String city){
		getCityTxtBox().clear();
		getCityTxtBox().sendKeys(city);
	}

    public void enterZipCode(String zipcode){
	  getZipCodeTxtBox().clear();
	  getZipCodeTxtBox().sendKeys(zipcode);
    }

	public void enterState(String state){
	   getStateTxtBox().clear();
	   getStateTxtBox().sendKeys(state);
	}
	
	public void clickSaveAddressButton(){
		getSaveAddressButton().click();
	}
	
	public void clickContinueToPaymentButton(){
		getContinueToPaymentButton().click();
	}


	
}
