package browser_instance_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonOpen {

	public static void main(String[] args) {
		
		WebDriver driver = createInstanceOfRequiredBrowser("chrome");

		// enter the URL
		driver.get("https://www.amazon.com");

		// get the application title and print the number of character available in it
		String applicationTitle = driver.getTitle();
		System.out.println("Application title: " + applicationTitle);
		System.out.println("No of character in Application title: " + applicationTitle.length());

		// get the application URL and print it
		String applicationCurrentUrl = driver.getCurrentUrl();
		System.out.println("Application URL: " + applicationCurrentUrl);

		// get the page source and print number character it has
		String pageSource = driver.getPageSource();
		System.out.println("Character in page source: " + pageSource.length());

		// close the current browser instance
		driver.close();
	}

	public static WebDriver createInstanceOfRequiredBrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		return driver;
	}

}