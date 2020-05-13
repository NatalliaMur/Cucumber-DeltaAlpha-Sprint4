package com.delta.step_defenitions;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.delta.pages.ManageTripPageN;
import com.delta.utilities.BrowserUtilities;
import com.github.javafaker.Faker;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageTripStepDefs {
	ManageTripPageN mngTripPage = new ManageTripPageN();
	Faker f = new Faker();
	Logger logger = Logger.getLogger(ManageTripStepDefs.class);
	
	@When("Click on Manage my trips link")
	public void click_on_Manage_my_trips_link() {
	  mngTripPage.manageMyTripLink.click(); 
	  
	}
	
	@Then("Click on Find Your Trip By dropdown")
	public void click_on_Find_Your_Trip_By_dropdown() {
	   mngTripPage.findYTripByDropDown.click();
	}

	@Then("Choose Confirmation Number in dropdown")
	public void choose_Confirmation_Number_in_dropdown() {
		BrowserUtilities.waitFor(3);
	  mngTripPage.confirmationNumber.click();  
	}
	

	@Then("Click on Hotel Reservation")
	public void click_on_Hotel_Reservation() {
		mngTripPage.hotelReservButton.click();
	}

	@Then("Enter Confirmation {string} and last name")
	public void enter_Confirmation_and_last_name(String confNum) {
		
		for (int i = 0; i <6; i++) {
			char ch = (char)(65 + (int) (Math.random() * 26));
			confNum = confNum+ch;
		}
		mngTripPage.inputConfNumber.sendKeys(confNum.substring(7));
		 mngTripPage.inputLastName.sendKeys(f.name().lastName());
	 }

	@Then("Click on Find booking button")
	public void click_on_Find_booking_button() {
	    mngTripPage.findBookingButton.click();
	}    
	
	@Then("Enter the characters that appear in the image below")
	public void enter_the_characters_that_appear_in_the_image_below() {
	    
	    mngTripPage.inputEnterChars.sendKeys("DGG");
    	mngTripPage.findBookingButton.click();
    	mngTripPage.inputEnterChars.sendKeys("LKB");
    	mngTripPage.findBookingButton.click();
    	mngTripPage.inputEnterChars.sendKeys("ABK");
    	mngTripPage.findBookingButton.click();	
	}
	    	    
//	    if(mngTripPage.emptyResultError.isDisplayed()) {
//	    	System.out.println("1");
//	    	assertTrue(mngTripPage.emptyResultError.getText().contains("We couldn’t find your booking."));
//	    	System.out.println("2");
//	    	break;
//	    }else{
//	    String setOfChars="";
//	    for (int i = 0; i <3; i++) {
//	    	
//	    	for (int j = 0; j < 3; j++) {
//	    		char ch = (char)(65 + (int) (Math.random() * 26));
//				setOfChars = setOfChars+ch;
//			}
//	    	mngTripPage.inputEnterChars.sendKeys(setOfChars);
//			mngTripPage.findBookingButton.click();
//		}
	   

	    

	 


}
