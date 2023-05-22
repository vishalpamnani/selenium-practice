package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSections {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> panelLInks = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//
//		System.out.println(panelLInks.size());
//
//		for (WebElement w : panelLInks) {
//			String linkText = w.getText();
//			System.out.println(linkText);
//		}
		
		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
		
		List<String> rightPanelLinkTextList = getElementsTextList(rightPanelLinks);
		System.out.println(rightPanelLinkTextList);
		System.out.println(rightPanelLinkTextList.contains("Login"));
		System.out.println(rightPanelLinkTextList.contains("Wish List"));
		System.out.println(rightPanelLinkTextList.contains("Newsletter"));
		
		
		By footerLinks = By.xpath("//footer//a");
		
		List<String> footerLinksList = getElementsTextList(footerLinks);
		System.out.println(footerLinksList);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {

		List<String> elementTextList = new ArrayList<String>();//size=0
		List<WebElement> eleList = getElements(locator);
		for (WebElement w : eleList) {
			String text = w.getText();
			elementTextList.add(text);

		}
		return elementTextList;
	}

}
