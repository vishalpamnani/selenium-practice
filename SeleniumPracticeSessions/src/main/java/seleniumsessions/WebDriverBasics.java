package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		
		//1. launch the browser
		String browser = "Super";
		WebDriver driver = null;
		
		
		//cross-browser logic using if-else 
//		if(browser.equals("Chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("Firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("Edge")) {
//			driver = new EdgeDriver();
//		}
//		else if(browser.equals("Safari")) {
//			driver = new SafariDriver();
//		}
//		else {
//			System.out.println("Browser not supported: "+browser);
//		}
		
		//cross-browser logic using switch case
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
			
		case "Firefox":
			driver = new FirefoxDriver();
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;
			
		case "Safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Browser not supported: "+browser);
			break;
		}
		
		
		
		
		
		//maximizing browser window
		driver.manage().window().maximize();

		
		//2. enter url
		driver.get("https://www.google.com");
		
		
		//3. get the title 
		String actualTitle = driver.getTitle();
		System.out.println("Page Title is "+actualTitle);
		
		//4. validation point/checkpoint
		if(actualTitle.equals("Google")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//Automation Steps + Validation/Assertions = Automation Testing
		
		driver.quit(); //closes the browser
		
		
		
		
		
	}

}
