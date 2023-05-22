package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
//		List<WebElement> linksList = getElements(links);
//		System.out.println("Total links: "+linksList.size());
//		
//		for(WebElement w : linksList) {
//			String hrefValue = w.getAttribute("href");
//			String linkText = w.getText();
//			
//			System.out.println(hrefValue + "----->" + linkText);
//		}
//		
//		List<WebElement> imagesList = getElements(images);
//		System.out.println("Total images: "+imagesList.size());
//		
//		for(WebElement w : imagesList) {
//			String srcValue = w.getAttribute("src");
//			System.out.println(srcValue);
//		}
		
		getElementAttributes(links, "href");
		getElementAttributes(images, "src");
		
		
		
		
	}
	
	public static void getElementAttributes(By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement w : eleList) {
			String attributeValue = w.getAttribute(attributeName);
			System.out.println(attributeValue);
		}
		
		
	}
	
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
