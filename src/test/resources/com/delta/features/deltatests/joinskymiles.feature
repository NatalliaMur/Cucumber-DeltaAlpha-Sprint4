Feature: Join SkyMiles page functionalities 


Background: 
			Given I am on the homepage
			When I click on log in 
			Then User click on Join SkyMiles link 
			
#			@JoinSkyMilesP
            Scenario: Verify the page header
			And  The header of  the page should be "JOIN SKYMILES" 
			
#			@JoinSkyMilesP
			Scenario Outline: Verify the Gender dropdown 
			And User clicks Gender dropdown
			Then User chooses "<GENDER>" from gender dropdown
			
	Examples:
	|GENDER    |
	|Male      |
	|Female    |
	|Select One|
	
	@JoinSkyMilesP
	Scenario Outline: Verify static dropDown suffix
	And User selects "<suffix>" from the dropDown
	
	Examples:
	| suffix |
	|   Sr   |
	|   CPA  |
	|   PhD  |