package eshopping.automation.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;

public class CartPage extends TestBase implements HomePageLocators{
	
	@FindBy(css="#main")
	private WebElement cartSection;
	
	@FindBy(css="a[href=checkout]")
	private WebElement checkoutButton;
	
	public CartPage(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartSection(){
		return cartSection;
	}
	
	public WebElement getCheckoutButton(){
		return checkoutButton;
	}
	
	public void clickCheckoutButton(){
		checkoutButton.click();
	}
	
	class Table{
		List<Row> rows;
		WebElement contextElement;
		public Table(By by){
			contextElement = driver.findElement(by);
			List<WebElement> list = contextElement.findElements(By.cssSelector("tbody>tr"));
			for(WebElement ele:list){
				rows.add(new Row(ele));
			}
		}
		
		class Row{
			WebElement context;
			
			public Row(WebElement ele){
				context = ele;
			}
		}
	}
}
