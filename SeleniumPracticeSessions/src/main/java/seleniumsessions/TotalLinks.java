package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		// find all links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// print the total link count

		int linksCount = links.size();
		System.out.println("Total Links: " + linksCount);

		// print the text of each link
		// and avoid blank texts

		// TODO
		// get total blank links count

//		for (int i = 0; i < linksCount; i++) {
//
//			String linkText = links.get(i).getText();
//
//			if (linkText.length() > 0) {
//				System.out.println(i + ":" + linkText);
//			}
//
//		}
		// for each
		int count = 0;
		for (WebElement w : links) {

			String linkText = w.getText();
			if (linkText.length() > 0) {
				System.out.println(count + ":" + linkText);
			}
			count++;
		}

	}

}
