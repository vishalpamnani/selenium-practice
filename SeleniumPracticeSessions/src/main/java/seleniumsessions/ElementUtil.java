package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean IsElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

	public void getElementAttributes(By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement w : eleList) {
			String attributeValue = w.getAttribute(attributeName);
			System.out.println(attributeValue);
		}

	}

	public int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("Total Elements for : " + locator + "---->" + eleCount);
		return eleCount;
	}

	public List<String> getElementsTextList(By locator) {

		List<String> elementTextList = new ArrayList<String>();// size=0
		List<WebElement> eleList = getElements(locator);
		for (WebElement w : eleList) {
			String text = w.getText();
			elementTextList.add(text);

		}
		return elementTextList;
	}

	// ***************** Select based drop down utils *****************\\

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public List<String> getDropDownOptionsTextList(By locator) {

		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement w : getDropDownOptionsList(locator)) {
			String text = w.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;

	}

	public void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement w : optionsList) {
			String text = w.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				w.click();
				break;
			}
		}
	}

	public int getTotalDropDownOptions(By locator) {

		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("Total Options : " + optionsCount);
		return optionsCount;

	}

}
