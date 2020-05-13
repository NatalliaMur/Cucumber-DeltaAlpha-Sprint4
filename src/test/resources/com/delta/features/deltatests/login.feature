Feature: Login functionality
		
		Background: 
			Given I am on the homepage
			When I click on log in 
		
		
		Scenario: Verify login page title 
			Then The login page title should be Login
			
			
		Scenario: Verify login page icons clickability 
			Then User clicks on show password icon
			And User clicks on keep me Logged in - New! box
			
	
		Scenario: Verify positive login 
		And I enter "AlitaShev" as username, "Shevchenko" as last name, "Alla34Edu" as password, and click login
		Then I should be able to land on Airline Tickets & Flights
			
		