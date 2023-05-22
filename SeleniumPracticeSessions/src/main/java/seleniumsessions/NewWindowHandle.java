package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		
//		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);

		
		driver.get("https://www.google.com");
		System.out.println("Child Window: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent Window: "+driver.getTitle());
		

	}

}
