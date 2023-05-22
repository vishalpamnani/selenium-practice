package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		// create a web element and then perform some action on it (click, sendkeys,
		// gettext, isDisplayed, etc)

		// create a webelement: need a locator

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. id: - unique attribute
		// driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");

		// 2. name:
		// driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		// By emailId = By.name("email");

		// 3. class name: can be duplicate most of the time - not recommended
		// use class name only if it's unique
		// driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");

		// 4. xpath: it's not an attribute, it is the address of the element in the HTML
		// DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");
//		doClick(loginBtn);

		// 5. css selector: it's not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

		// 6. linkText: only for links --> html tag = a / Link Text can be duplicate
		// not an attribute, it is the text of the link
		// driver.findElement(By.linkText("Register")).click();
		// By registrationLink = By.linkText("Register");

		// doClick(registrationLink);

		// 7. partial linkText: only for links
		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. tagName:
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		//getText: links, headers, paragraphs, footer
		// using get text method on a link
		By payment = By.linkText("Recurring payments");
		String val = doElementGetText(payment);
		System.out.println(val);
		
	}
	
	
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

}