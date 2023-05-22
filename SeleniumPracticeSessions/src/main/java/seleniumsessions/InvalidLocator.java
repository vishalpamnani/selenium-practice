package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.xpath("//////input[@@@id='name']")).sendKeys("QWERTY");
		//InvalidSelectorException
		
		driver.findElement(By.xpath("//input[@id='vishal']")).sendKeys("QWERTY");
		//NoSuchElementException
		
		
		
		

	}

}
	