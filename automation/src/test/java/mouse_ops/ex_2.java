package mouse_ops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusable_component.genericFunction;

public class ex_2 {

	public static void main(String[] args) {
       WebDriver driver=genericFunction.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://demo.automationtesting.in/Register.html");
		//create an instance of actions class and pass driver instance to its constructor
		Actions action=new Actions(driver);
		
		
		List<WebElement> mainMenuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//hover on HOME link
		//action.moveToElement(mainMenuList.get(0)).perform();
		
		action.moveToElement(mainMenuList.get(2),200,0).perform();
		
//		for(int i=0;i<mainMenuList.size();i++) {
//			action.moveToElement(mainMenuList.get(i)).perform();
//			GenericFunctions.setSleep(1000);

	}

}
