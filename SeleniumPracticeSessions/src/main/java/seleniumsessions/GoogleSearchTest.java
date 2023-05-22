package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Naveen automation labs");
		
		Thread.sleep(3000);
		
		By googleSuggestionsList = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		doSearch(googleSuggestionsList, "naveen automationlabs resume");
		

	}
	
	public static void doSearch(By suggestionListLocator, String suggestionName) {
		
		List<WebElement> suggestionsList = driver.findElements(suggestionListLocator);
		System.out.println(suggestionsList.size());
		
		for(WebElement w : suggestionsList){
			String text = w.getText();
			if(text.length()>0) {
			System.out.println(text);
			}
			if(text.contains(suggestionName)) {
				w.click();
				break;
			}
		}

		
	}

}
