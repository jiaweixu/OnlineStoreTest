package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_Steps {
	private static WebDriver driver = null;
	
	@After
	public void closeWebsite(){
		driver.quit();
	}
	
	@Given("^User browse the product page$")
	public void user_browse_the_product_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");	        
		driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website 
        driver.get("http://store.demoqa.com/products-page/product-category/n/");
	}

	@When("^User add one product to an empty cart$")
	public void user_add_one_product_to_an_empty_cart() throws Throwable {
		driver.findElement(By.cssSelector("input[name='Buy']")).click();
		Thread.sleep(10000);
	}

	@Then("^The item number in the cart is \"([^\"]*)\"$")
	public void the_item_number_in_the_cart_is(String arg1) throws Throwable {
		WebElement parentElement = driver.findElement(By.id("header_cart"));
		WebElement childElement = parentElement.findElement(By.className("count"));
		String countSt = childElement.getText();
		Assert.assertEquals(arg1, countSt);
	}
	
	@Given("^User browse the product page with cart already has (\\d+) item$")
	public void user_browse_the_product_page_with_cart_already_has_item(int arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");	        
		driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website 
        driver.get("http://store.demoqa.com/products-page/product-category/n/");
		driver.findElement(By.cssSelector("input[name='Buy']")).click();
		Thread.sleep(10000);
        driver.get("http://store.demoqa.com/products-page/product-category/magic-mouse/");
	}

	@When("^User add one product to the cart$")
	public void user_add_one_product_to_the_cart() throws Throwable {
		driver.findElement(By.cssSelector("input[name='Buy']")).click();
		Thread.sleep(10000);
	}
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");	        
		driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website 
        driver.get("http://www.store.demoqa.com");
 	    
	    
	}

	@When("^User navigate to LogIn page$")
	public void user_navigate_to_LogIn_page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String name, String passwd) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(name); 	 
	    driver.findElement(By.id("pwd")).sendKeys(passwd);
	    driver.findElement(By.id("login")).click();
	    
	}

	@Then("^User successfully login to \"([^\"]*)\"$")
	public void user_successfully_login_to(String arg1) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(arg1));
	}
	
	@Then("^User successfully login$")
	public void user_successfully_login() throws Throwable {
		Boolean isPresent = driver.findElements(By.id("account_logout")).size() > 0;
		Assert.assertTrue(isPresent);
		System.out.println("login successfully, then logout");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@Given("^User has logged in with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_has_logged_in_with_and(String arg1, String arg2) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");	        
		driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website 
        driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();       
		driver.findElement(By.id("log")).sendKeys(arg1); 	 
	    driver.findElement(By.id("pwd")).sendKeys(arg2);
	    driver.findElement(By.id("login")).click();
	    
	}

	@When("^User logout from the website$")
	public void user_logout_from_the_website() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@Then("^User logout Successfully$")
	public void user_logout_Successfully() throws Throwable {
		Boolean isPresent = driver.findElements(By.id("login")).size() > 0;
		Assert.assertTrue(isPresent);
	}


	@Then("^User failed to login with \"([^\"]*)\" message$")
	public void user_failed_to_login_with_message(String arg1) throws Throwable {
		WebElement parentElement = driver.findElement(By.className("response"));
		WebElement childElement = parentElement.findElement(By.tagName("strong"));
		System.out.println("Error Message: "+ childElement.getText());
	    Assert.assertTrue(childElement.getText().contains(arg1));
	    
	}

	@Given("^User open a Firefox browser$")
	public void user_open_a_Firefox_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\J\\workspace\\library\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");	        
		driver = new FirefoxDriver();
	    
	}

	@When("^User input the URL address \"([^\"]*)\"$")
	public void user_input_the_URL_address(String arg1) throws Throwable {
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website 
        driver.get(arg1);
	}

	@Then("^User can go into the \"([^\"]*)\" page$")
	public void user_can_go_into_the_page(String arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-64")));
		Assert.assertTrue(driver.getTitle().contains(arg1));

	    
	}


	@When("^User click the Home button$")
	public void user_click_the_Home_button() throws Throwable {
	    driver.findElement(By.id("menu-item-15")).click();
	    
	}

	@When("^User click the Product Category button$")
	public void user_click_the_Product_Category_button() throws Throwable {
	    
		driver.findElement(By.id("menu-item-33")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^User click the All Product button$")
	public void user_click_the_All_Product_button() throws Throwable {
	    driver.findElement(By.id("menu-item-72")).click();
	    
	}

}
