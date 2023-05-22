package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLInks {

static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langLinks.size());
		
		for(WebElement w : langLinks) {
			String text = w.getText();
			System.out.println(text);
			if(text.equals("ગુજરાતી")) {
				w.click();
				break;
			}
		}
		

	}

	//1. click on a specific lang link
	//2. return the list of lang links
	//3. capture the list of google footer links
	
}
