package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//by locators: Object Repository
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By privacyPolicy = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By accountCreatedHeader = By.tagName("h1");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Vishal");
		eleUtil.doSendKeys(lastName, "Pamnani");
		eleUtil.doSendKeys(email, "vishal@gmail.com");
		eleUtil.doSendKeys(telephone, "9090909090");
		eleUtil.doSendKeys(password, "vishal@123");
		eleUtil.doSendKeys(confirmPassword, "vishal@123");
		eleUtil.doClick(privacyPolicy);
		eleUtil.doClick(continueBtn);
		String header = eleUtil.doElementGetText(accountCreatedHeader);
		System.out.println(header);
	}

}
