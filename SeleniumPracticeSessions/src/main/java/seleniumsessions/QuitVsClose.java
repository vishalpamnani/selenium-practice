package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		//SID - session  id
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
		System.out.println(driver.getTitle()); // session id has become null
		//NoSuchSessionException: Session ID is null because we are using driver after calling quit().

	}

}
