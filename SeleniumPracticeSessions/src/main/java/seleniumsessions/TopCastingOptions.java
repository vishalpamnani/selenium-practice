package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1. browser specific 
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver1 = new FirefoxDriver();
		
		//2. WD = new CD - valid top casting - recommended
		//WebDriver driver = new ChromeDriver();
		
		//3. SC = new CD - valid top casting - not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. RWD = new CD - valid top casting - recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. WD = new RWD - valid top casting - recommended - GRID - used for remote execution
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. SC = new RWD - valid top casting - not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		

	}

}
