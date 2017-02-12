package eshopping.automation.stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import eshopping.automation.pageObjects.OrderPage;

/**
 * Cart Page steps 
 * @author 
 *
 */
public class OrderPageSteps {
    
    private OrderPage orderPage = new OrderPage();

    @Given("^verify order successful message is displayed as \"([^\"]*)\"$")
	public void verifyOrderSuccessMsg(String message) throws Throwable {
      Assert.assertEquals(orderPage.getThanksMsgHeader(), message, "Order Successful message is not same");
	}
    
    @Given("^verify order status of product is \"([^\"]*)\"$")
	public void verifyOrderStatus(String message) throws Throwable {
      Assert.assertEquals(orderPage.getOrderTable().getRows().get(0).getCols().get(2).getText().trim(), message, "Order status is not same");
	}
	
}
