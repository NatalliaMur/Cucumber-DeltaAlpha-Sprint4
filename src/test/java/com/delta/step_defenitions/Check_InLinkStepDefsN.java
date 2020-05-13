package com.delta.step_defenitions;

import com.delta.pages.Check_InCCPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.utilities.Driver;
import com.delta.utilities.LoggerUtils;
import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Check_InLinkStepDefsN {

	Logger logger = LoggerUtils.getLogger(Check_InLinkStepDefsN.class);

	@Given("I am on a main page")
	public void i_am_on_a_main_page() {
		
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
	}
	
	@Then("Click on check-in link")
	public void click_on_check_in_link() {
		Check_InCCPage checkIn = new Check_InCCPage();
		checkIn.checkInLink.click();
	}

	@Then("Click on Find Your Trip By dropdown box")
	public void click_on_Find_Your_Trip_By_dropdown_box() {
		Check_InCCPage checkIn = new Check_InCCPage();
		checkIn.findYourTripByDropDown.click(); 
	}

	@Then("Click on each following option in Find Your Trip By dropdown box")
	public void click_on_each_following_option_in_Find_Your_Trip_By_dropdown_box() {
		Check_InCCPage checkIn = new Check_InCCPage();
		BrowserUtilities.waitFor(1);
		checkIn.getElement1();
	}
	
	@Then("Choose option Credit Card Number")
	public void choose_option_Credit_Card_Number() {
		Check_InCCPage checkIn = new Check_InCCPage();
		checkIn.findYourTripByDropDown.click();
		BrowserUtilities.waitFor(2);
		checkIn.creditCardNumber.click();
	}

	@Then("Enter credit card number and last name")
	public void enter_credit_card_number_and_last_name() {
		Check_InCCPage checkIn = new Check_InCCPage();
	   Faker f = new Faker();
	   checkIn.creditCardInput.sendKeys("1234456778905588");
	   checkIn.lastName.sendKeys(f.name().lastName());
	   	   
	}

	@Then("Enter airport in input box From Airport")
	public void enter_airport_in_input_box_From_Airport() {
		Check_InCCPage checkIn = new Check_InCCPage();
		Actions actions = new Actions(Driver.getDriver());
		
		System.out.println("1");
		checkIn.fromAirport.click();
		System.out.println("2");

		String city = "new york";
		actions.moveToElement(checkIn.inputAirport).sendKeys(city).click().build().perform();
		
		checkIn.listFromAirport(city);
	}



}
