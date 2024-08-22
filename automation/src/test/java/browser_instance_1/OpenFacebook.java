package browser_instance_1;

import org.openqa.selenium.WebDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		//instance
		WebDriver driver = createInstanceOfRequiredBrowser("chrome");

		// URL
		driver.get("https://www.facebook.com");

		// get the application title 
		String applicationTitle = driver.getTitle();
		System.out.println("Application title: " + applicationTitle);

		// close 
		driver.close();
	}

	private static WebDriver createInstanceOfRequiredBrowser(String string) {
		WebDriver driver = null;
		if(driver .getTitle().equalsIgnoreCase("some expected text")) {
		    //Pass
		    System.out.println("Page title contains expected text ");
		}else {
		    //Fail
		    System.out.println("Page title doesn't contains expected text");
		}
	return null;
	}


}
/*
 * 
 * 1. Launch the web browser.
 *  2. Open the URLÂ https://www.facebook.comÂ in the
 * current browser. 
 * 3. Fetching home page title.
 *  4. Verify actual tile of the home page with the expected title.
 *  5. Print home page title on the console.
 * 6. Close the browser.
 * 
 * 
 */
