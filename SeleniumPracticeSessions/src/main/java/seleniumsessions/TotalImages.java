package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		
		int totalImages = imageList.size();
		
		System.out.println(totalImages);
		
		
	}

}
