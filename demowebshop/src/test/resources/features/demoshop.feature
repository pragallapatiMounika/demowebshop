@tag 
Feature: Login for demoWebShop 
	I want to use this template for my feature files
@tag1 
Scenario Outline: Login To DemoWeb with valid credentials 
	Given User Is On My LoginPage 
	When User Fillup uid <username> 
	And User Fillup pwd <password> 
	Then User click LoginButton 
	
	Examples: 
		|	username                 |	password	    |
		|	user1	                 |	userpass        |