package com.delta.step_defenitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.delta.pages.Check_InCCPage;
import com.delta.pages.Check_inConfNumberPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;
import com.delta.utilities.LoggerUtils;

import io.cucumber.java.en.Then;

public class Check_inConfNumberStepDefsN {
	Check_inConfNumberPage confNoPage=new Check_inConfNumberPage();
	Check_InCCPage checkIn;
	Actions actions = new Actions(Driver.getDriver());
	Logger logger = LoggerUtils.getLogger(Check_inConfNumberStepDefsN.class);
	
	@Then("Choose Confirmation Number in dropdown box")
	public void choose_Confirmation_Number_in_dropdown_box() {
	  confNoPage.confirmationNuber.click();  
	}

	@Then("Enter incorrect number {string}")
	public void enter_incorrect_number(String incorNo) {
		BrowserUtilities.waitFor(3);
		System.out.println("before input");
	    confNoPage.inputConfirmNo.sendKeys(incorNo, Keys.ENTER);
	    System.out.println("after input");
	    
	}

	@Then("Confirm the error message {string}")
	public void confirm_the_error_message(String string) {
		BrowserUtilities.waitFor(3);
		
		assertEquals(confNoPage.errorMessage.getText(), string); 
	}

	@Then("Click on link help about Confirmation Number and confirm title pop-up window {string}")
	public void click_on_link_help_about_Confirmation_Number_and_confirm_title_pop_up_window(String title) {
	   confNoPage.helpLink.click();
	   assertEquals(confNoPage.titlePopUp.getText(), title);
	}

	@Then("Close link help")
	public void close_link_help() {
	   confNoPage.closePopUp.click();
	}

	@Then("Remove incorrect number and enter correct number {string}")
	public void remove_incorrect_number_and_enter_correct_number(String string) {
	    confNoPage.inputConfirmNo.clear();
	    confNoPage.inputConfirmNo.sendKeys(string);
	}

	@Then("Enter city")
	public void enter_city() {
		System.out.println("1");
		confNoPage.fromAirport.click();
		System.out.println("2");

		String city = "venice";
		actions.moveToElement(confNoPage.inputAirport).sendKeys(city).click().build().perform();
		
		confNoPage.listFromAirport(city);
		System.out.println("3");
	}
	
	@Then("Click on each link in Connect With Us section")
	public void click_on_each_link_in_Connect_With_Us_section() {
	    
	    confNoPage.facebookWindow();

	}
	
	
	@Then("Click on Twitter link")
	public void click_on_Twitter_link() {
		 BrowserUtilities.waitFor(4);
		 confNoPage.twitterWindow(); 
	}

}
