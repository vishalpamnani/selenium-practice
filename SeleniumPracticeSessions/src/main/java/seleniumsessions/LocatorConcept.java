package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// create a web element and then perform some action on it (click, sendkeys,
		// gettext, isDisplayed, etc)

		// create a webelement: need a locator

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");



		//id 
		
		// 1st approach
		
		
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		
		// 2nd approach
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement passwordId = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("naveen@gmail.com");
//		passwordId.sendKeys("naveen@123");
		
		
		// 3rd approach: By locator
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		eId.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");
		
		
		// 4th approach: By locator + generic method
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
		
		
		// 5th approach: By locator + generic method for webelement and actions
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");
		
		// 6th approach: By locator + generic method for webelement and actions in a ElementUtil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
