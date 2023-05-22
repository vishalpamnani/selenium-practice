package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldEnterValue {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
//		WebElement pwd = driver.findElement(By.id("pass"));
//		pwd.sendKeys("qwertyuiop");
		
		
		driver.get("https://classic.freecrm.com/register/");
		
		Thread.sleep(3000);
		
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		
		String disableText = submitBtn.getAttribute("disabled");
		System.out.println(disableText);
		
		submitBtn.click();
		
		
		

	}

}
