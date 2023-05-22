package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/vishalpamnani/Downloads/Vishal Pamnani SDET Resume 2023.pdf");
		
		// <tag type='file'> --  this is mandatory attribute
		//autoIT/Sikuli/Robot -- not recommended
		


	}

}
	