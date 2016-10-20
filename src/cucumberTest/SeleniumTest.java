package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SeleniumTest {
		private static WebDriver driver = null;
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
 
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		 	        
		driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
 
        // Find the element that's ID attribute is 'account'(My Account) 
        
        String titleWeb = driver.getTitle();
        System.out.println("title is: "+ titleWeb);
        
        String addressWeb = driver.getCurrentUrl();
        System.out.println("url is: "+ addressWeb);
        
 //       String pageSource = driver.getPageSource();
 //       System.out.println("url is: "+ pageSource);
 /*
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.id("login")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 */
        // Close the driver
        
        driver.quit();
 
	}
 
}