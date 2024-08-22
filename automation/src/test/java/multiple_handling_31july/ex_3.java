package multiple_handling_31july;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusable_component.genericFunction;



public class ex_3 {

	public static void main(String[] args) {
		WebDriver driver = genericFunction.createInstanceOfRequiredBrowser("chrome");

		driver.get("https://www.demoblaze.com/");		
		//print device name and price
		List<WebElement> deviceNames=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
		List<WebElement> devicePrices=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));
		
		for(int i=0;i<deviceNames.size();i++) {
//			WebElement device=deviceNames.get(i);
//			WebElement price=devicePrices.get(i);
//			String deviceName=device.getText();
//			String devicePrice=price.getText();
//			System.out.println(deviceName +" "+devicePrice);
						//or			
			System.out.println(deviceNames.get(i).getText() +" :"+ devicePrices.get(i).getText());
		}
	}

}