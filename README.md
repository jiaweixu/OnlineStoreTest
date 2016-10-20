# IS2545 DELIVERABLE 3: Web Testing 
## Jiawei XU (jix20)

Features, User Story and Scenarios:
Feature: Add product to Cart
	
	As a user
	I want to add a product to cart
	that I may purchase it later


Scenario: Add a product to an empty cart
Given User browse the product page
When User add one product to an empty cart
Then The item number in the cart is "1"


Scenario: Add a product to an cart with 1 item
Given User browse the product page with cart already has 1 item
When User add one product to the cart
Then The item number in the cart is "2"

Feature: Login Action

	As a user
	I want to log into my account 
	so that I can browse the website as a member

Scenario: Successful login with valid credentials
Given User is on Home page
When User navigate to LogIn page
And User enters "jiaweixu001" and "Abc123!@#"
Then User successfully login

Scenario: Successful LogOut
Given User has logged in with "jiaweixu001" and "Abc123!@#"
When User logout from the website
Then User logout Successfully

Scenario: Failed login with invalid credentials
Given User is on Home page
When User navigate to LogIn page
And User enters "username" and "password"
Then User failed to login with "ERROR" message


Feature: Page availability

	As a user
	I want to navigate to a specific page 
	so that I can browse the content on that page

Scenario: Home Page Test
Given User open a Firefox browser
When User input the URL address "http://www.store.demoqa.com"
Then User can go into the "ONLINE STORE" page

Scenario: Home Page Link Test
Given User is on Home page
When User click the Home button
Then User can go into the "ONLINE STORE" page	

Scenario: Product Category Page Link Test
Given User is on Home page
When User click the Product Category button
Then User can go into the "Product" page

Scenario: All Product Page Link Test
Given User is on Home page
When User click the All Product button
Then User can go into the "Product" page


The challenge in this project is:</br>
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


2. Testing results:</br>
![TestResult1](https://github.com/jiaweixu/OnlineStoreTest/blob/master/Materials/Test_result1.PNG "Testing Results")
![TestResult2](https://github.com/jiaweixu/OnlineStoreTest/blob/master/Materials/Test_result2.PNG "Testing Results")
</br>
