package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		int totalFrames = driver.findElements(By.xpath("//frame")).size();
		System.out.println(totalFrames);
		
		//driver.switchTo().frame(2); --> index
		//driver.switchTo().frame("main"); --> name or id
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']"))); //WebElement
		
		
		
		
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
