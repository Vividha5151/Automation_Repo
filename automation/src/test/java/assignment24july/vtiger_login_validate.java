package assignment24july;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import reusable_component.genericFunction;

public class vtiger_login_validate {

	public static void main(String[] args) {
		WebDriver driver = genericFunction.createInstanceOfRequiredBrowser("chrome");

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		driver.findElement(By.id("username")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("password")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("password")).sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("buttonBlue")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String expectedUrlContent = "login";
		String currenUrl = driver.getCurrentUrl();
		System.out.println("Home page validation status: " + (!currenUrl.contains(expectedUrlContent)));

	}

}
/*
 * TC1: https://demo.vtiger.com/vtigercrm/index.php open chrome browser enter
 * application url delete existing text and enter username as Admin delete
 * existing text and enter password as admin click on login button validation
 * home page - with title - with URL logout from the application finally close
 * the browser
 */
