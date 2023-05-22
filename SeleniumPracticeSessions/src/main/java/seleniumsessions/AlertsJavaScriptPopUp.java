package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//js alert = alert, prompt, confirm
		//auth pop-up
		//browser window pop up/adv pop up
		//file upload pop up
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
		
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		
//		alert.accept();
//		alert.dismiss();
		
		//confirm:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		
//		alert.accept();
//		alert.dismiss();
		
		
		//prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("12##$%0978VIKpLSK^&QW");
		alert.accept();
		//alert.dismiss();
		
		

	}

}
