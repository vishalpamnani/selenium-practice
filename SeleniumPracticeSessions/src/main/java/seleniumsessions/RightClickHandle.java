package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickBtn).build().perform();
		
		List<WebElement> rightEles = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
		System.out.println(rightEles.size());
		
		for(WebElement w : rightEles) {
			
			String text = w.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				w.click();
				break;
			}
			
			
		}

	}

}
