package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String placeholderValue = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(placeholderValue);
//		
//		String srcValue = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String title = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		
//		System.out.println(srcValue + " & " + title.toUpperCase());
		
		By fn = By.name("firstname");
		By logo = By.className("img-responsive");
		
		String placehValue = getElementAttribute(fn, "placeholder");
		String srcValue = getElementAttribute(logo, "src");
		String titleValue = getElementAttribute(logo, "title");
		
		System.out.println(placehValue);
		System.out.println(srcValue);
		System.out.println(titleValue);

		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

}