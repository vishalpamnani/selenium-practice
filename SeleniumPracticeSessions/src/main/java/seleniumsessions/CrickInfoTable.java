package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/lucknow-super-giants-vs-royal-challengers-bangalore-43rd-match-1359517/full-scorecard");

		String wktTkrName = getWicketTackerName("Karn Sharma");
		System.out.println(wktTkrName);

		wktTkrName = getWicketTackerName("Glenn Maxwell");
		System.out.println(wktTkrName);

		wktTkrName = getWicketTackerName("Mahipal Lomror");
		System.out.println(wktTkrName);
		
		List<String> sirajScoreCard = getPlayerScoreCard("Mohammed Siraj");
		System.out.println(sirajScoreCard);

	}

	public static String getWicketTackerName(String batsman) {

		return driver
				.findElement(By.xpath("//span[text()='" + batsman + "']/ancestor::td/following-sibling::td//span/span"))
				.getText();

	}

	public static List<String> getPlayerScoreCard(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
		
		List<String> playerScoreList = new ArrayList<String>();
		
		for(WebElement e : scoreList) {
			String text = e.getText();
			playerScoreList.add(text);
		}
		
		return playerScoreList;

	}

}
