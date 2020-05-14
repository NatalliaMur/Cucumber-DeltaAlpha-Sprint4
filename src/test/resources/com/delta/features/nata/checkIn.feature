Feature: Cheking functionality check in link

Background: 
Given I am on a main page
Then Click on check-in link


#Scenario: Clicking on check-in button
#Given I am on a main page
#Then Click on check-in link
@test
Scenario: Choose each option in Find Your Trip By dropdown box
Then Click on Find Your Trip By dropdown box
And Click on each following option in Find Your Trip By dropdown box
Then Choose option Credit Card Number
And Enter credit card number and last name
Then Enter airport in input box From Airport


Scenario: Confirmation Number
Then Click on Find Your Trip By dropdown box
Then Choose Confirmation Number in dropdown box
Then Enter incorrect number "485959483"
And Confirm the error message "Please enter a valid Confirmation Number"
Then Click on link help about Confirmation Number and confirm title pop-up window "Where to locate a Confirmation Number?"
And Close link help
Then Remove incorrect number and enter correct number "SFTORB"
Then Enter city
Then Click on submit button go to next page 
Then Click on each link in Connect With Us section
#And Click on Twitter link

Scenario: Ticket number
Then Click on Find Your Trip By dropdown box
Then Choose Ticket number in dropdown box
Then Enter Ticket number "5811672740123"
Then Click on link help 
And Confirm title pop-up window "Where to locate a Ticket Number?"
And Close link help 
Then Enter city
Then Click on submit button go to next page
And Confirm error message "Whoops! We're sorry, but we are unable to find a check-in eligible reservation with the information provided."  
Then Click on each link in Get To Know Us


Scenario: SkyMiles Number
Then Click on Find Your Trip By dropdown box
Then Choose SkyMiles Number in dropdown box
And Enter SkyMiles Number "1234098756"
Then Enter city
Then Click on submit button go to next page
Then I enter the following credentials, I should be able to login
     |johntriplover|Lovemyself1986|
     
     

#Scenario: Confirmation Number
#Then Click on Find Your Trip By dropdown box
#Then Choose Confirmation Number in dropdown box
#Then Enter incorrect number "485959483"
#Then Click on link help about Confirmation Number and confirm title pop-up window "Where to locate a Confirmation Number?"
#And Close link help
#Then Remove incorrect number and enter correct number "SFTORB"
#Then Enter city
#Then Click on submit button go to next page 
#And Click on Twitter link     






