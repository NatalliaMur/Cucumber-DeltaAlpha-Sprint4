Feature: Myprofile page features functionalities



  Scenario: Veryfy I am on MyProfile page
    Given I am on the home page
    Then I click on login button
    And I am on login page and enter username "Terrence3er4fd3", surname "Braun" and password "Lovemyself1986"
    When I loged into my account and click on account name and profile window popup should appear
    Then I click on Profile button and I am in MY PROFILE page.
    
    Scenario: Add Ground Transportaion
    Given I am on the home page
    Then I click on login button
    And I am on login page and enter username "Terrence3er4fd3", surname "Braun" and password "Lovemyself1986"
    When I loged into my account and click on account name and profile window popup should appear
    Then I click on Profile button and I am in MY PROFILE page.
    When I click on GROUND TRANSPORTATION OPEN button and I land on GROUND TRANSPORTATION page
    And I choose "Private" option from dropDown
    Then I save the choice and Private message should display 

    Scenario: Add ACTIVITIES and INTERESTS
    Given I am on the home page
    Then I click on login button
    And I am on login page and enter username "Terrence3er4fd3", surname "Braun" and password "Lovemyself1986"
    When I loged into my account and click on account name and profile window popup should appear
    Then I click on Profile button and I am in MY PROFILE page.
    When I click on ACTIVITIES & INTERESTS OPEN button and I land on ACTIVITIES & INTERESTS page
    And I choose Attractions and Air Adventures options from the list
    Then I save the choices



    Scenario: Add FLIGHT PREFERENCES
    Given I am on the home page
    Then I click on login button
    And I am on login page and enter username "Terrence3er4fd3", surname "Braun" and password "Lovemyself1986"
    When I loged into my account and click on account name and profile window popup should appear
    Then I click on Profile button and I am in MY PROFILE page.
    When I click on FLIGHT PREFERENCES OPEN button and I land on FLIGHT PREFERENCES page
    And Enter "MCI" in the PREFERRED DEPARTURE CITY OR AIRPORT field and save the choice
    And Select "Window" option from the PREFERRED SEAT TYPE drop down list and save the choice


    Scenario: SAVE SEARCHES
    Given I am on the home page
    Then I click on login button
    And I am on login page and enter username "Terrence3er4fd3", surname "Braun" and password "Lovemyself1986"
    When I loged into my account and click on account name and profile window popup should appear
    Then I click on Profile button and I am in MY PROFILE page.
    When I click on SAVED SEARCHES OPEN button and I land on SAVED SEARCHES page
    And Select "Leisure" option from the REASON FOR TRAVEL drop down list
    And Select BOOK SKYMILES AWARD TICKET checkbox
    And Enter "MCI" in the From Airport field and enter "JFK" in the To Airport
    And Select "2am" from Departure Time drop down list and select "2am" from Return Time drop down list
    And Select "2" from Passengers drop down list
    Then Select "Basic Economy" class from Cabin drop down list and save changes    



