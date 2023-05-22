package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement tarEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
//		act
//			.clickAndHold(srcEle)
//				.moveToElement(tarEle)
//					.release()
//						.build()
//							.perform();
		
		act.dragAndDrop(srcEle, tarEle).build().perform();
		
		

	}

}
