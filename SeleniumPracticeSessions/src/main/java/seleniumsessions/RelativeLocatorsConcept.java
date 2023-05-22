package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.linkText("Airdrie, Canada"));
		String eleText = ele.getText();
		
		WebElement rightEle = driver.findElement(with(By.tagName("p")).toRightOf(ele));
		String aqi = rightEle.getText();
		System.out.println("The AQI of "+eleText+" is: "+aqi);
		
		WebElement leftEle = driver.findElement(with(By.tagName("p")).toLeftOf(ele));
		String rank = leftEle.getText();
		System.out.println("Rank of "+eleText+" is: "+rank);
		
		
		String aboveElement = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println("City above "+eleText+" is: "+aboveElement);
		
		String belowElement = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println("City below "+eleText+" is: "+belowElement);
		
		String nearestElement = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println("Nearest Element to "+eleText+" is "+nearestElement);

	}

}
