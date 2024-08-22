package drop_down_handling_2august;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reusable_component.genericFunction;
public class ex_3 {

	public static void main(String[] args) {
		WebDriver driver = genericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");	
		
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		
		List<WebElement> countryList=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println(countryList.size());
		for(WebElement element: countryList) {
			System.out.println(element.getText());
		}
		
		countryList.get(5).click();
	}
}