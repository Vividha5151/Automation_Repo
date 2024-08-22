package assignment24july;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reusable_component.genericFunction;

public class orangeHRM {

	public static void main(String[] args) {
		WebDriver driver = genericFunction.createInstanceOfRequiredBrowser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
     	String expectedUrlContent = "login";
		String currenUrl = driver.getCurrentUrl();
		System.out.println("Home page validation status: " + (!currenUrl.contains(expectedUrlContent)));

	}
}