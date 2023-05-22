package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		if(currentURL.contains("amazon.com")) {
			System.out.println("PASS");
		}
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		if(pageSource.contains("NAVYAAn FOOTER END")) {
			System.out.println("PASS");
		}
		
		driver.quit();

	}

}
