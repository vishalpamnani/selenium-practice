package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");

		//By country = By.id("Form_getForm_Country");
		By countryDropDown = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		List<WebElement> optionsList = driver.findElements(countryDropDown);		
		System.out.println(optionsList.size());
		
		for(WebElement w : optionsList) {
			String text = w.getText();
			System.out.println(text);
			if(text.equals("India")) {
				w.click();
				break;
			}
		}
		
		

	}
	
	

}
