package synchronization;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusable_component.genericFunction;

public class implicit_1 {

	public static void main(String[] args) {
		WebDriver driver=genericFunction.createInstanceOfRequiredBrowser("chrome");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//after implicit wait, driver will get default time as define in implicit wait, 0-30
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30 sec		
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30 sec		
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30 sec
	}

}
