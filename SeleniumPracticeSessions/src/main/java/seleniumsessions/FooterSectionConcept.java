package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<String> infoFooterList = getFooterSectionList("Information");
		System.out.println(infoFooterList);
		
		List<String> accountFooterList = getFooterSectionList("My Account");
		System.out.println(accountFooterList);

	}
	
	
	public static List<String> getFooterSectionList(String sectionName) {
		List<WebElement> sectionList =  driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		
		System.out.println(sectionList.size());
		List<String> sectionValues = new ArrayList<String>();
		for(WebElement w : sectionList) {
			
			String text = w.getText();
			sectionValues.add(text);
		}
		return sectionValues;
	}
	

}
