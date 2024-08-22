package browser_instance_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenVTiger {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com");
		
		String ApplicationTitle = driver.getTitle();
		System.out.println("Application tittle "+ApplicationTitle);
		System.out.println("Application tittle "+ApplicationTitle.length());
		
		String ApplicationCurrentURL = driver.getCurrentUrl();
		System.out.println("Application URL "+ApplicationCurrentURL);
		
		String pagesource= driver.getPageSource();
		System.out.println("Page Source  "+pagesource.length());
		
		driver.close();
		
	}
	public static WebDriver createInstanceOfRequiredBrowser(String browserName) {
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}
/*
 * Launch a new Chrome browser.
Open https://demo.vtiger.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Close the Browser.
*/
 