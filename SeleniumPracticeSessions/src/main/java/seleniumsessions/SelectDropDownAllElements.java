package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");

		By country = By.id("Form_getForm_Country");

//		Select select = new Select(driver.findElement(country));
//
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size() - 1);
//
//		for (WebElement w : countryList) {
//
//			String text = w.getText();
//			System.out.println(text);
//			if (text.equals("Brazil")) {
//				w.click();
//				break;
//			}
//		}

//		if (getTotalDropDownOptions(country) - 1 == 232) {
//			System.out.println("Country dropdown count is correct!");
//		}
//
//		if (getDropDownOptionsTextList(country).contains("India")) {
//			System.out.println("India is present!");
//		}
//		
//		List<String> expectedCountryList = Arrays.asList("India", "Peru", "Spain");
//		
//		if(getDropDownOptionsTextList(country).containsAll(expectedCountryList)) {
//			System.out.println(expectedCountryList + " are present in the country dropdown");
//		}
		
		selectDropDownValue(country, "Argentina");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public static List<String> getDropDownOptionsTextList(By locator) {

		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement w : getDropDownOptionsList(locator)) {
			String text = w.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;

	}
	
	
	public static void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for(WebElement w : optionsList) {
			String text = w.getText();
			System.out.println(text);
			if(text.equals(expValue)) {
				w.click();
				break;
			}
		}
	}

	public static int getTotalDropDownOptions(By locator) {

		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("Total Options : " + optionsCount);
		return optionsCount;

	}

}
