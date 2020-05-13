package com.delta.step_defenitions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.delta.pages.Sprint4_Beck_ActivityInterPage;
import com.delta.pages.Sprint4_Beck_FlightPrefPage;
import com.delta.pages.Sprint4_Beck_GroundTransPage;
import com.delta.pages.Sprint4_Beck_HomePage;
import com.delta.pages.Sprint4_Beck_LoginPage;
import com.delta.pages.Sprint4_Beck_MyProfilePage;
import com.delta.pages.Sprint4_Beck_ProfilePage;
import com.delta.pages.Sprint4_Beck_SavedSearchesPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sprint4_Beck_MyProfileStepDefs {
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		BrowserUtilities.waitFor(2);
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		Sprint4_Beck_HomePage hp = new Sprint4_Beck_HomePage();
		hp.loginButton.click();
	}

	@Then("I am on login page and enter username {string}, surname {string} and password {string}")
	public void i_am_on_login_page_and_enter_username_surname_and_password(String username, String lastname, String password) {
		Sprint4_Beck_LoginPage lp = new Sprint4_Beck_LoginPage();
		BrowserUtilities.waitFor(3);
		lp.usernameField.sendKeys(username);
		BrowserUtilities.waitFor(2);
		lp.lastnameField.sendKeys(lastname);
		BrowserUtilities.waitFor(2);
		lp.passwordField.sendKeys(password);
		BrowserUtilities.waitFor(2);
		lp.submitButton.click();
		BrowserUtilities.waitFor(2);
		
	}

	@When("I loged into my account and click on account name and profile window popup should appear")
	public void i_loged_into_my_account_and_click_on_account_name_and_profile_window_popup_should_appear() {
		Sprint4_Beck_ProfilePage pp = new Sprint4_Beck_ProfilePage();
		pp.profileName.click();
		BrowserUtilities.waitFor(2);
	}

	@Then("I click on Profile button and I am in MY PROFILE page.")
	public void i_click_on_Profile_button_and_I_am_in_MY_PROFILE_page() {
		Sprint4_Beck_ProfilePage pp = new Sprint4_Beck_ProfilePage();
		pp.profileButton.click();
		Sprint4_Beck_MyProfilePage mpp = new Sprint4_Beck_MyProfilePage();
		String expected = "MY PROFILE";
		String actual = mpp.myprofileText.getText();
		BrowserUtilities.waitFor(3);
		assertEquals(expected, actual);
			
	}
	
	@When("I click on GROUND TRANSPORTATION OPEN button and I land on GROUND TRANSPORTATION page")
	public void i_click_on_GROUND_TRANSPORTATION_OPEN_button_and_I_land_on_GROUND_TRANSPORTATION_page() {
		Sprint4_Beck_MyProfilePage mpp = new Sprint4_Beck_MyProfilePage();
		mpp.groundTransOpenButton.click();
		Sprint4_Beck_GroundTransPage gtp = new Sprint4_Beck_GroundTransPage();
		String expected = "GROUND TRANSPORTATION";
		String actual = gtp.groundTransText.getText();
		BrowserUtilities.waitFor(3);
		assertEquals(expected, actual);
		
	}
	

	@Then("I choose {string} option from dropDown")
	public void i_choose_option_from_dropDown(String string) {
		Sprint4_Beck_GroundTransPage gtp = new Sprint4_Beck_GroundTransPage();
		gtp.select.click();
		Select select = new Select(gtp.select);
		select.selectByVisibleText(string);
		
	}

	@Then("I save the choice and Private message should display")
	public void i_save_the_choice_and_Private_message_should_display() {
		Sprint4_Beck_GroundTransPage gtp = new Sprint4_Beck_GroundTransPage();
		gtp.saveGroundTransport.click();
		String expected = "Private";
		BrowserUtilities.waitFor(3);
		String actual = gtp.savedChoice.getText();
		assertEquals(expected, actual);

	}
	
	@When("I click on ACTIVITIES & INTERESTS OPEN button and I land on ACTIVITIES & INTERESTS page")
	public void i_click_on_ACTIVITIES_INTERESTS_OPEN_button_and_I_land_on_ACTIVITIES_INTERESTS_page() {
		
		Sprint4_Beck_MyProfilePage mpp = new Sprint4_Beck_MyProfilePage();
		mpp.activitiesInterOpenButton.click();
		Sprint4_Beck_ActivityInterPage aip = new Sprint4_Beck_ActivityInterPage();
		String expected = "ACTIVITIES AND INTERESTS";
		String actual = aip.actInterText.getText().trim();
		BrowserUtilities.waitFor(3);
		assertEquals(expected, actual);
		
		
	}

	@When("I choose Attractions and Air Adventures options from the list")
	public void i_choose_Attractions_and_Air_Adventures_options_from_the_list() {
		Sprint4_Beck_ActivityInterPage aip = new Sprint4_Beck_ActivityInterPage();
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(aip.attractions).click().build().perform();
		BrowserUtilities.waitFor(2);
		actions.moveToElement(aip.airAdventures).click().build().perform();
		BrowserUtilities.waitFor(2);
		
	}


	@Then("I save the choices")
	public void i_save_the_choices() {
		Sprint4_Beck_ActivityInterPage aip = new Sprint4_Beck_ActivityInterPage();
		aip.saveActivities.click();
		BrowserUtilities.waitFor(3);
		

	}
	
	
	@When("I click on FLIGHT PREFERENCES OPEN button and I land on FLIGHT PREFERENCES page")
	public void i_click_on_FLIGHT_PREFERENCES_OPEN_button_and_I_land_on_FLIGHT_PREFERENCES_page() {
		Sprint4_Beck_MyProfilePage mpp = new Sprint4_Beck_MyProfilePage();
		mpp.flightprefOpenButton.click();
		Sprint4_Beck_FlightPrefPage fpp = new Sprint4_Beck_FlightPrefPage();
		String expected = "FLIGHT PREFERENCES";
		String actual = fpp.flightPrefText.getText().trim();
		BrowserUtilities.waitFor(3);
		assertEquals(expected, actual);
		
	}
	
	@When("Enter {string} in the PREFERRED DEPARTURE CITY OR AIRPORT field and save the choice")
	public void enter_in_the_PREFERRED_DEPARTURE_CITY_OR_AIRPORT_field_and_save_the_choice(String string) {
		Sprint4_Beck_FlightPrefPage fpp = new Sprint4_Beck_FlightPrefPage();
		fpp.prefAirport.sendKeys(string);
		BrowserUtilities.waitFor(2);
		fpp.savePrefDepAirport.click();
		BrowserUtilities.waitFor(2);
	}


	@When("Select {string} option from the PREFERRED SEAT TYPE drop down list and save the choice")
	public void select_option_from_the_PREFERRED_SEAT_TYPE_drop_down_list_and_save_the_choice(String string) {
		Sprint4_Beck_FlightPrefPage fpp = new Sprint4_Beck_FlightPrefPage();
		fpp.select.click();
		Select select = new Select(fpp.select);
		select.selectByVisibleText(string);
		BrowserUtilities.waitFor(2);
		fpp.savePrefSeatType.click();
		BrowserUtilities.waitFor(2);
	}
	
	@When("I click on SAVED SEARCHES OPEN button and I land on SAVED SEARCHES page")
	public void i_click_on_SAVED_SEARCHES_OPEN_button_and_I_land_on_SAVED_SEARCHES_page() {
		Sprint4_Beck_MyProfilePage mpp = new Sprint4_Beck_MyProfilePage();
		mpp.savedSearchesOpenButton.click();
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		String expected = "SAVED SEARCHES";
		String actual = ssp.savedSearchesText.getText().trim();
		BrowserUtilities.waitFor(3);
		assertEquals(expected, actual);
	}
	
	@Then("Select {string} option from the REASON FOR TRAVEL drop down list")
	public void select_option_from_the_REASON_FOR_TRAVEL_drop_down_list(String string) {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		ssp.reasonTravel.click();
		Select select = new Select(ssp.reasonTravel);
		select.selectByVisibleText(string);
		BrowserUtilities.waitFor(2);
	}

	@Then("Select BOOK SKYMILES AWARD TICKET checkbox")
	public void select_BOOK_SKYMILES_AWARD_TICKET_checkbox() {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(ssp.bookSkymiles).click().build().perform();
		BrowserUtilities.waitFor(2);
	}

	@Then("Enter {string} in the From Airport field and enter {string} in the To Airport")
	public void enter_in_the_From_Airport_field_and_enter_in_the_To_Airport(String string, String string2) {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		ssp.fromAirportField.sendKeys(string);
		ssp.toAirport.sendKeys(string2);
		
	}

	@Then("Select {string} from Departure Time drop down list and select {string} from Return Time drop down list")
	public void select_from_Departure_Time_drop_down_list_and_select_from_Return_Time_drop_down_list(String string, String string2) {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		ssp.depTime.click();
		Select select = new Select(ssp.depTime);
		select.selectByVisibleText(string);
		BrowserUtilities.waitFor(2);
		ssp.retTime.click();
		Select sel = new Select(ssp.retTime);
		sel.selectByVisibleText(string2);
		BrowserUtilities.waitFor(2);

		
		
	}

	@Then("Select {string} from Passengers drop down list")
	public void select_from_Passengers_drop_down_list(String string) {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		ssp.passNumber.click();
		Select select = new Select(ssp.passNumber);
		select.selectByVisibleText(string);
		BrowserUtilities.waitFor(2);

	}

	@Then("Select {string} class from Cabin drop down list and save changes")
	public void select_class_from_Cabin_drop_down_list_and_save_changes(String string) {
		Sprint4_Beck_SavedSearchesPage ssp = new Sprint4_Beck_SavedSearchesPage();
		ssp.seatClassType.click();
		Select select = new Select(ssp.seatClassType);
		select.selectByVisibleText(string);
		BrowserUtilities.waitFor(2);
		ssp.saveNewTrip1.click();
		BrowserUtilities.waitFor(2);

	}





}
