package eshopping.automation.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;

public class PaymentPage extends TestBase implements HomePageLocators{
	
	@FindBy(css="#creditCardNumber")
	private WebElement cardNumberTxtBox;
	
	@FindBy(css="#name")
	private WebElement nameTxtBox;
	
	@FindBy(css="#expityMonth")
	private WebElement expiryMonthTxtBox;
	
	@FindBy(css="#expityYear")
	private WebElement expiryYearTxtBox;
	
	@FindBy(css="#cvCode")
	private WebElement cvvCodeTxtBox;
	
	@FindBy(xpath="//button[text()='Pay']")
	private WebElement payButton;
	
	public PaymentPage(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCardNumberTxtBox() {
		return cardNumberTxtBox;
	}

	public WebElement getNameTxtBox() {
		return nameTxtBox;
	}

	public WebElement getExpiryMonthTxtBox() {
		return expiryMonthTxtBox;
	}

	public WebElement getExpiryYearTxtBox() {
		return expiryYearTxtBox;
	}

	public WebElement getCvvCodeTxtBox() {
		return cvvCodeTxtBox;
	}

	public WebElement getPayButton() {
		return payButton;
	}

	public void enterCardNumber(String cardNumber){
		getCardNumberTxtBox().clear();
		getCardNumberTxtBox().sendKeys(cardNumber);
	}
	
	public void enterName(String name){
		getNameTxtBox().clear();
		getNameTxtBox().sendKeys(name);
	}
	
	public void enterExpiryMonth(String month){
		getExpiryMonthTxtBox().clear();
		getExpiryMonthTxtBox().sendKeys(month);
	}
	
	public void enterExpiryYear(String year){
		getExpiryYearTxtBox().clear();
		getExpiryYearTxtBox().sendKeys(year);
	}
	
	public void enterCVVCode(String cvcode){
		getCvvCodeTxtBox().clear();
		getCvvCodeTxtBox().sendKeys(cvcode);
	}
	
	public void clickPayButton(){
		getPayButton().click();
	}
}
