package browser_validation;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import reusable_component.genericFunction;

public class amazon {

	public static void main(String[] args) {
		    //launch browser
			WebDriver driver=genericFunction.createInstanceOfRequiredBrowser("chrome");
			
			//open url
			driver.get("www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//maximize browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//to set browser window with desired size
			driver.manage().window().setSize(new Dimension(500, 700));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//page tittle and print
			String expectedTitle = "https://www.amazon.in/";
			driver.getTitle();
			System.out.println("Tittle=  "+driver.getTitle());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//minimize browser window
			//driver.manage().window().minimize();
			//maximize browser window
			//driver.manage().window().maximize();
			//implicit wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//after implicit wait, driver will get default time as define in implicit wait, 0-30
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//driver.findElement(By.className("https://www.amazon.in/")).click();
			//Navigate back to Home Page.
			driver.navigate().back();
			
			//if you are navigated back to previous screen and want to goto next screen again
			//driver.navigate().forward();
			
			//to reload use
			//driver.navigate().refresh();
			
			//to move to another URL
			//driver.navigate().to("https://www.google.com");
	}

}
/*Steps to Automate:
1. Launch browser of your choice say., firefox, chrome etc.
2. Open this URL -  www.amazon.in
3. Maximize or set size of browser window.
4. Get the page title and print it.
5. Click on first menu link, say 'Amazon Pay'.//
6. Get Page title and verify it with expected value.
7. Navigate back to Home Page. 
8. Get Page title and verify it with expected value. 9. Repeat steps 5 to 8 for other menu links. 10. Close the browser.
*/