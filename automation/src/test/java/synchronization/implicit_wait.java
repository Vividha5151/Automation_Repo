package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusable_component.genericFunction;

public class implicit_wait {

	public static void main(String[] args) {
WebDriver driver=genericFunction.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("orangehrm-login-button")).click();

	}

}
