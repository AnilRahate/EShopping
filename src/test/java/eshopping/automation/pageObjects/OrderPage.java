package eshopping.automation.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import eshopping.automation.base.TestBase;
import eshopping.automation.locators.HomePageLocators;
import eshopping.automation.pageObjects.CartPage.Table.Row;

public class OrderPage extends TestBase implements HomePageLocators{
	
	@FindBy(css="#main>h3")
	private WebElement thanksMsgHeader;
		
	public OrderPage(){
		PageFactory.initElements(driver, this);
		waitForPageLoad();
	}
	
	public String getThanksMsgHeader(){
		return thanksMsgHeader.getText().trim();
	}
	public Table getOrderTable(){
		return new Table(By.cssSelector("#main table"));
	}

	public class Table{
		List<Row> rows = new ArrayList<>();;
		WebElement contextElement;
		public Table(By by){
			contextElement = driver.findElement(by);
			List<WebElement> listRow = contextElement.findElements(By.cssSelector("tbody>tr"));
			for(WebElement ele:listRow){
				wait.until(ExpectedConditions.visibilityOf(ele));
				rows.add(new Row(ele));
			}
	
		}
		public List<Row> getRows(){
			return rows;
		}
		
		public class Row{
			WebElement context;
			List<WebElement> columns= new ArrayList<>();
			public Row(WebElement ele){
				context = ele;
				List<WebElement> listCol = contextElement.findElements(By.cssSelector("td"));
				if(listCol.size()>0){
				for(WebElement td:listCol){
					if(td!=null)
					columns.add(td);
				}
				}
			}
			public List<WebElement> getCols(){
				return columns;
			}
		}
	}
}
