Feature: Testing Adactin application end to end  process 

Background:
    Given the user is logged in
    And goes to landing page
@SmokeTest
Scenario Outline: verify that user is able to login the application 

	Given User launch the application 
	When User enters the valid "<username>" in the username field 
	And User enters the valid "<password>" in the password field 
	And User clicks on the login button 
	Then user verify the homepage navigates to search hotel 
	
	Examples: 
	
		|username|password|
		|AAA|111|
		|BBB|222|
		|CCC|333|
		|Pavikumaresh|Pavikums@24|
		
		
		
		
