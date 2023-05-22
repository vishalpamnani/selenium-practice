package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);

		brUtil.launchURL("https://www.amazon.com");

		String pageTitle = brUtil.getPageTitle();
		if(pageTitle.contains("Amazon")){
			System.out.println("Title -- Pass");
		}else {
			System.out.println("Title -- Fail");
		}

		String pageURL = brUtil.getPageURL();
		if(pageURL.contains("amazon")) {
			System.out.println("URL -- Pass");
		}else {
			System.out.println("URL -- Fail");
		}

		brUtil.quitBrowser();

	}

}
