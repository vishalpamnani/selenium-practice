package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement twitterElement = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		twitterElement.click();
		
		//get the window ids
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window Id is: "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window Id is: "+childWindowId);
		
		//switching to window:
		driver.switchTo().window(childWindowId);
		System.out.println("Chid Window URL: "+driver.getCurrentUrl());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window URL: "+driver.getCurrentUrl());
		
		//driver.quit();
		

	}

}
