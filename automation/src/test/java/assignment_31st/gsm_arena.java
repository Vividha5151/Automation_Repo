package assignment_31st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsm_arena {

	public static void main(String[] args) {
		WebDriver driver = createInstanceOfRequiredBrowser("chrome");

		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> deviceNames=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
		List<WebElement> devicePrices=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));

		

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

