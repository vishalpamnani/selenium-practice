package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		Thread.sleep(4000);
		
		selectUser("Adam Lambert");
		selectUser("Fatima Sana");
		
		String cName = getUserCompanyName("Kishore Venkat");
		System.out.println(cName);

		cName = getUserCompanyName("Fatima Sana");
		System.out.println(cName);
		
		cName = getUserCompanyName("David Cris");
		System.out.println(cName);
		

	}
	// (//a[text()='Chicago Bruner']/parent::td/preceding-sibling::td/input[@type='checkbox'])[1]"))
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox'])[1]")).click();
		
	}
	
	public static String getUserCompanyName(String userName) {
		return driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company'])[1]")).getText();
	}
	

}
