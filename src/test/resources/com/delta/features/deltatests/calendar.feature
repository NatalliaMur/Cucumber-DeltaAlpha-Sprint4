Feature: Calendar functionality 

Background: 
			Given I am on the homepage
			When I click on log in 
			And I enter "AlitaShev" as username, "Shevchenko" as last name, "Alla34Edu" as password, and click login
			Then I should be able to land on Airline Tickets & Flights
			
			
			
			@calendar
			Scenario Outline:  Verify Select Trip Drop down
			Then User selects trip type "<trip>"
			Examples:
			|trip      |
			|Multi-City|
			|Round Trip|
			|One Way   |
			
			
		
		@calendar
		Scenario: Verify Calender when round trip is choosen 
		Then User checks dropdown is "Round Trip" by default 
		And User pickes departure  Month "May" and departure year "2020" and departure date "5"
#		And User pickes arrivel  Month "November" and arrivel year "2020" and arrivel date "22"
#		And User clickes done button 
