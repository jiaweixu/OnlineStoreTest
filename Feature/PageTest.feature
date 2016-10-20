
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
	