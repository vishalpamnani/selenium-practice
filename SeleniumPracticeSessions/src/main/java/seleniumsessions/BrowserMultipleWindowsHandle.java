package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		WebElement twitterElement = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fBElement = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement yTElement = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		WebElement lNElement = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));

		
		twitterElement.click();
		fBElement.click();
		yTElement.click();
		lNElement.click();
		
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(!windowId.equals(parentWindowId))
			driver.close();
			 
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window URL: "+driver.getCurrentUrl());

	}

}
