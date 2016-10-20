# IS2545 DELIVERABLE 3: Web Testing 
## Jiawei XU (jix20)
</br>
This project is to use Selenium(3.0.1 for Java), Cucumber(1.2.5 for core), Gherkin(2.12.4), and Junit(4.12), etc with Eclipse IDE to test an online store website: http://store.demoqa.com.

### Demo Video of the whole test on my Windows laptop:
https://youtu.be/NiogsopBanc

### 3 Features/User Stories and 9 Scenarios:</br>
#### Feature: Add product to Cart
	
	As a user
	I want to add a product to cart
	that I may purchase it later


</br>Scenario: Add a product to an empty cart
</br>Given User browse the product page
</br>When User add one product to an empty cart
</br>Then The item number in the cart is "1"
</br>

</br>Scenario: Add a product to an cart with 1 item
</br>Given User browse the product page with cart already has 1 item
</br>When User add one product to the cart
</br>Then The item number in the cart is "2"
</br>
#### Feature: Login Action

	As a user
	I want to log into my account 
	so that I can browse the website as a member

</br>Scenario: Successful login with valid credentials
</br>Given User is on Home page
</br>When User navigate to LogIn page
</br>And User enters "jiaweixu001" and "Abc123!@#"
</br>Then User successfully login
</br>
</br>Scenario: Successful LogOut
</br>Given User has logged in with "jiaweixu001" and "Abc123!@#"
</br>When User logout from the website
</br>Then User logout Successfully
</br>
</br>Scenario: Failed login with invalid credentials
</br>Given User is on Home page
</br>When User navigate to LogIn page
</br>And User enters "username" and "password"
</br>Then User failed to login with "ERROR" message
</br>

#### Feature: Page availability

	As a user
	I want to navigate to a specific page 
	so that I can browse the content on that page

</br>Scenario: Home Page Test
</br>Given User open a Firefox browser
</br>When User input the URL address "http://www.store.demoqa.com"
</br>Then User can go into the "ONLINE STORE" page
</br>
</br>Scenario: Home Page Link Test
</br>Given User is on Home page
</br>When User click the Home button
</br>Then User can go into the "ONLINE STORE" page	
</br>
</br>Scenario: Product Category Page Link Test
</br>Given User is on Home page
</br>When User click the Product Category button
</br>Then User can go into the "Product" page
</br>
</br>Scenario: All Product Page Link Test
</br>Given User is on Home page
</br>When User click the All Product button
</br>Then User can go into the "Product" page
</br>

### The challenge in this project is:</br>
<ol> 
<li>WebDriver problem:</br></li>
For selenium 3, gecko driver is needed. And different version of browser and Selenium may give different results.
</br>

<Li>Gherkin version problem:</br></li>
The lastest verion of Gherkin (2.12.4) on its webpage is not the bottom-most version (2.9.3).
Without the newest version, there is an error: "java.lang.NoClassDefFoundError: gherkin/lexer/Encoding".
</br>

<Li>Assert deprecated problem:</br></li>
Not using junit.framework.Assert but org.junit.Assert can resolve this problem
</br>

<Li>click a button then need to wait until the next page is ready:</br></li>
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-64")));
</br>

<Li>click a button then need to wait 5 seconds:</br></li>
		thread.sleep(5000);
</br>

<Li>Sometimes, if the website response is slow, the test may fail.</br></li>

<Li>When testing login function with many times, the website may block the current IP address to make the test failed.</br></li>
![TestFailed](https://github.com/jiaweixu/OnlineStoreTest/blob/master/Materials/FailedReason.PNG "Testing Failed")
		
</br>
### Testing results:</br>
![TestResult1](https://github.com/jiaweixu/OnlineStoreTest/blob/master/Materials/Test_result1.PNG "Testing Results")
![TestResult2](https://github.com/jiaweixu/OnlineStoreTest/blob/master/Materials/Test_result2.PNG "Testing Results")
</br>
