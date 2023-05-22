package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement fn = driver.findElement(By.id("input-email"));
		
		fn.sendKeys("naveen@gmail.com");
		
		driver.navigate().refresh(); // new version of DOM
		
		
		fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("vishal@gmail.com"); //org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
	
		
		

	}

}
