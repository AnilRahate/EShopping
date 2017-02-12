package eshopping.automation.modal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
    
	private List<WebElement> list;
	
	
	public Products(WebDriver driver,By by){
		this.list = driver.findElements(by);
	}
	
	public List<WebElement> getProductList(){
		return this.list;
	}
	
	public WebElement getProductByIndex(int index){
		return this.list.get(index);
	}
	
	public WebElement getProductImage(WebElement product){
		return product.findElement(By.cssSelector("img"));
	}
	
	public WebElement getProductTitle(WebElement product){
		return product.findElement(By.cssSelector("div>h4>a"));
	}
	
	public WebElement getProductManufacturer(WebElement product){
		return product.findElement(By.cssSelector("div.caption>p:nth-child(2)"));
	}
	
	public WebElement getProductDescription(WebElement product){
		return product.findElement(By.cssSelector("div.caption>p:nth-child(3)"));
	}
	
	public WebElement getProductPrice(WebElement product){
		return product.findElement(By.cssSelector("div.row>div>p"));
	}
	
	public WebElement getProductAddToCartButton(WebElement product){
		return product.findElement(By.cssSelector("div.row>div>a"));
	}
}
