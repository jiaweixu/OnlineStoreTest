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