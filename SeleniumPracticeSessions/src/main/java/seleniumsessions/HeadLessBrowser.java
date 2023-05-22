package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//browser is not visible
		//headless - testing is happening behind the scene
		//faster than GUI mode
		
		//sanity test cases
		//might not work for complex html dom
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
