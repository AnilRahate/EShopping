package eshopping.automation.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;

public class LoginPage extends TestBase implements HomePageLocators{
	
	@FindBy(css="#userName")
	private WebElement userNameTxtBox;
	
	@FindBy(css="#password")
	private WebElement passwordTxtBox;
	
	@FindBy(css="#btn-login")
	private WebElement loginButton;
	
	@FindBy(xpath="//div/a[contains(.,'Sign Up Here')]")
	private WebElement signUpLinkTxt;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		waitForPageLoad();
	}

	public WebElement getUserNameTxtBox() {
		return userNameTxtBox;
	}

	public WebElement getPasswordTxtBox() {
		return passwordTxtBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSignUpLinkTxt() {
		return signUpLinkTxt;
	}

	public void login(String username, String password){
		getUserNameTxtBox().clear();
		getUserNameTxtBox().sendKeys(username);
		getPasswordTxtBox().clear();
		getPasswordTxtBox().sendKeys(password);
		getLoginButton().click();
	}
	
	
}
