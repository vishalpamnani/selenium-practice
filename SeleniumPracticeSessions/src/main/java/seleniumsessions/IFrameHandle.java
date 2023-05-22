package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registraion-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Sample Form");
		
		driver.switchTo().defaultContent();

	}

}
