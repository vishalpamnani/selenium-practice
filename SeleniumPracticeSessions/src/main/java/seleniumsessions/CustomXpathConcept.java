package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//xpath: address of the element in the dom
		//1. absolute xpath: xpath from the starting node till the desired element
		//2. relative xpath: custom xpath
		
		//tag[@attributeName='value']
		//input[@id='input-email']
		//input[@placeholder='E-Mail Address']
		
		//tag[@attri1='value' and @attri2='value']
		//input[@type='text' and @name='email']
		//input[@type='text' and @name='email' and @id='input-email']
		
		
		//xpath with text();
		//text is not an attribute, it's the text content of the element
		//don't use @text, use it as a function
		//tag[text()='value']
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		
		By newCust = By.xpath("//h2[text()='Returning Customer']");
		
		//check My Account link is present on the page - two times
		
		By myAcc = By.xpath("//a[text()='My Account']");
		int myAccCount = driver.findElements(myAcc).size();
		if(myAccCount == 2) {
			System.out.println("PASS");
		}

		//text() with attribute:
		//tag[@attri='value' and text()='value']
		//a[@class ='list-group-item' and text()='Returns']
		
		//tag[@attri1='value' and @attri='value' and text()='value']
		//a[@class ='list-group-item' and text()='Register' and @href]
		//a[@href]
		
		//contains() with attribute;
		//tag[contains(@attr, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		
		//contains() with one attribute and use another without contains();
		//tag[contains(@attr1, 'value') and @attr2='value']
		//input[contains(@placeholder, 'E-') and @name='email']
		//input[contains(@placeholder, 'E-') and @name='email' and @type='text']
		
		//dynamic attributes
		//use contains()
		
		//contains() with text():
		//tag[contains(text(), 'value')]
		//p[contains(text(), 'IT, and CRM')]
		//a[contains(text(), 'Amazon')]
		
		//contains() with text() and contains() with attribute:
		//tag[contains(text(), 'value') and contains(@attr, 'value')]
		//a[contains(text(), 'Science') and contains(@href, 'amazon.science')]
		
		//contains() with text() and attribute without contains:
		//tag[contains(text(), 'value') and @attr = 'value']
		//a[contains(text(), 'Science') and @class='nav_a']
		
		//starts-with();
		//tag[starts-with(text(), 'value')]
		//a[starts-with(text(), 'Amazon')]

		//ends-with() in xpath? - NA
		
		//position in xpath - index
		// (//input[@class='form-control'])[1]
		// (/input[@class='form-control'])[position()=1]
		By.xpath("(//input[@class='form-control'])[1]");
		
		// (/input[@class='form-control'])[position()=1]

		// (//input[@class='form-control'])[4]
		// (//input[@class='form-control'])[last()]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).getText();
		
		//class in locator: className, xpath, css
		
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email'] -- not valid, in xpath you have to use all classes
		
		//input[contains(@class, 'login-email')]
		
		//parent to child:
		
//		parent/child --> direct
//		parent//child --> direct+indirect
	
		//child to parent: bacward traversing in xpath
		//input[@id='input-email']/../../../..
		
		//siblings:
		//input[@id='input-email']/preceding-sibling::label
		//label[@for='input-email']/following-sibling::input
		//label[@for='input-email']/following-sibling::input[@name='email']
		
		
	}

}
