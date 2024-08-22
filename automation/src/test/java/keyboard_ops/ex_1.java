package keyboard_ops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusable_component.genericFunction;

public class ex_1 {

	public static void main(String[] args) {
        WebDriver driver=genericFunction.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://online.actitime.com/uts/login.do");
		//type user name
		driver.findElement(By.id("username")).sendKeys("admin01");
		//type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys("admin01",Keys.ENTER);
	}
}
