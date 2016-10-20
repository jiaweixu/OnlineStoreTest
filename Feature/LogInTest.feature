#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

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



