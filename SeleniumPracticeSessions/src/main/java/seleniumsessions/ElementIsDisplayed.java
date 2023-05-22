package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.model.InheritedPseudoElementMatches;

public class ElementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if (flagImg)
//			System.out.println("PASS");

//		boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//		if (flagSearch) {
//			System.out.println("PASS");
//			driver.findElement(By.name("search")).sendKeys("macbook");
//		}
		
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.cssSelector("#search > span > button");
		
		if(IsElementDisplayed(logoImage)) {
			System.out.println("Image is present -- PASS");
		}
		
		if(IsElementDisplayed(search)) {
			System.out.println("Search is present -- PASS");
			doSendKeys(search, "Macbook");
			doClick(searchIcon);
		}
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean IsElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	

}
