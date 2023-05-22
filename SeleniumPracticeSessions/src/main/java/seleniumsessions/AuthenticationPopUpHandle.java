package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String username = "admin";
		String password = "admin";
		
		driver= new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		

	}

}
