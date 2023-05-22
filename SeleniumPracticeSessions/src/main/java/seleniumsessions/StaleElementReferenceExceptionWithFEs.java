package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionWithFEs {

	static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		
		List<WebElement> footerLinksList = driver.findElements(By.xpath("(//ul[@class='sc-ace17a57-0 sc-37672556-0 kTjuIu PoUXa'])[3]//a")); 
		
		for(int i=0; i<footerLinksList.size(); i++) {
			footerLinksList.get(i).click();
			
			//driver.navigate().back();
			
			footerLinksList = driver.findElements(By.xpath("(//ul[@class='sc-ace17a57-0 sc-37672556-0 kTjuIu PoUXa'])[3]//a"));
		}
		
	}

}
