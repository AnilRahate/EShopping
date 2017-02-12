package eshopping.automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import eshopping.automation.utils.ApplicationPropertiesInitializer;

public class TestBase {
	public static WebDriver driver = null;
	public  static ApplicationPropertiesInitializer applicationProperties = null; 
	public  String path= System.getProperty("user.dir");
	public  String separatorFile = System.getProperty("file.separator");
	public  WebDriverWait wait;
    public TestBase(){
    	if(driver == null){
    		applicationProperties = new ApplicationPropertiesInitializer();
    		initilizeBrowser();
    	}
    	
    		wait = new WebDriverWait(driver, 30);
            wait.ignoring(NoSuchElementException.class);
            wait.ignoring(StaleElementReferenceException.class);
            wait.pollingEvery(500, TimeUnit.MILLISECONDS);
    	
    }
    
    /**
     * To initialize/launch browser
     * @param browser
     */
    public  void initilizeBrowser(){
    	String browser=System.getProperty("browser");
    	switch (browser) {
		case "chrome":
			String dir = "D://chromedriver.exe";
			//String dir = path + separatorFile + "Config/Drivers/chromedriver.exe";
			System.out.println("--------------------------------------------"+dir);
			System.setProperty("webdriver.chrome.driver", dir);
			driver = new ChromeDriver();
			break;
        case "firefox":
			driver = new FirefoxDriver();
			break;
        case "ie":
        	System.setProperty("webdriver.ie.driver", "Config/Drivers/IEDriverServer.exe");
    		driver = new ChromeDriver();
			break;
			
		default:
			driver = new FirefoxDriver();
			break;
		}
    	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
    }
    /**
     * To wait for a page to load until it gets in ready state
     */
    public  void waitForPageLoad() {
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver input) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");				
			}
		});		
	}
    
    /**
     * To wait for specific element on the page for defined period[explicit wait]
     * @param element
     * @param seconds
     * @return
     *//*
    public boolean waitForElement(WebElement element, int seconds) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(seconds, TimeUnit.SECONDS)
				.pollingEvery((seconds/5), TimeUnit.SECONDS);	
		return wait.until(visibilityOf(element)) !=null;
    }	*/
    public <T> T doWait(ExpectedCondition<T> condition) {
        return wait.until(condition);
    }

    public WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public Actions getActions() {
        return new Actions(driver);
    }

    public void type(WebElement element, CharSequence text) {
        doWait(visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void select(WebElement element, String option) {
        doWait(visibilityOf(element));
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (NoSuchElementException e) {
            try {
                select.selectByValue(option);
            } catch (NoSuchElementException ex) {
                select.selectByIndex(Integer.parseInt(option));
            }
        }
    }

    public void jsClick(WebElement element) {
        doWait(elementToBeClickable(element));
        getJS().executeScript("return arguments[0].click();", element);
    }

    public void click(WebElement element) {
        doWait(elementToBeClickable(element));
        element.click();
    }

    public String getValue(WebElement element) {
        doWait(visibilityOf(element));
        return element.getAttribute("value");
    }

    public String getText(WebElement element) {
        doWait(visibilityOf(element));
        return element.getText().trim();
    }

    public String getSelectedOption(WebElement element) {
        doWait(visibilityOf(element));
        return new Select(element).getFirstSelectedOption().getText();
    }

    public List<String> getSelectedOptions(WebElement element) {
        doWait(visibilityOf(element));
        //return new Select(element).getAllSelectedOptions().stream().map(WebElement::getText).collect(toList());
        List<String> list = new ArrayList<>();
        for(WebElement ele: new Select(element).getAllSelectedOptions()){
        	list.add(ele.getText());
        }
        return list;
    }

    public JavascriptExecutor getJS() {
        return (JavascriptExecutor) driver;
    }

    public void scrollToTop() {
        getJS().executeScript("scrollTo(0,0);");
    }

    public void scrollElementIntoView(WebElement element) {
        getJS().executeScript("return arguments[0].scrollIntoView(true);", element);
    }   
}
