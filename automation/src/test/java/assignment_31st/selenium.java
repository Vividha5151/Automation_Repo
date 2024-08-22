package assignment_31st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selenium {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("chrome");

		driver.get("https://www.google.com/");		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//identify suggestion given by google
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count: "+suggList.size());
		for(int i=0;i<suggList.size();i++) {
			
			//to avoid staleElementException re-identify suggList
			suggList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			
			WebElement element=suggList.get(i);
			String suggestion=element.getText();
			System.out.println(suggestion);
		}
	
	}

}
