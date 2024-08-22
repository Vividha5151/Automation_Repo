package assignment24july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) {
		WebDriver driver = createInstanceOfRequiredBrowser("chrome");

		driver.get("https://www.saucedemo.com/inventory.html");

		driver.findElement(By.id("username")).sendKeys("standard_user");

		driver.findElement(By.id("Password")).sendKeys("secret_sauce");

		driver.findElement(By.id("Login")).click();

		String expectedUrlContent = "login";
		String currenUrl = driver.getCurrentUrl();
		System.out.println("Home page validation status: " + (!currenUrl.contains(expectedUrlContent)));

	}
	public static WebDriver createInstanceOfRequiredBrowser(String browserName) {
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}

