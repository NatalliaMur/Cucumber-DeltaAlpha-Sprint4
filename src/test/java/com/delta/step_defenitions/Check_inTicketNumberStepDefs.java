package com.delta.step_defenitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.delta.pages.Check_inTicketNumberPage;
import com.delta.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;

public class Check_inTicketNumberStepDefs {
	Check_inTicketNumberPage ticketNoPage=new Check_inTicketNumberPage();
	Logger logger = Logger.getLogger(Check_inTicketNumberStepDefs.class);

	@Then("Choose Ticket number in dropdown box")
	public void choose_Ticket_number_in_dropdown_box() {
	 ticketNoPage.ticketNumber.click();
	}

	@Then("Enter Ticket number {string}")
	public void enter_Ticket_number(String ticketNo) {
		BrowserUtilities.waitFor(1);
	  ticketNoPage.inputTicketNo.sendKeys(ticketNo);
//		ticketNoPage.inputTicketNo.sendKeys("5811672740123");
	}

	@Then("Click on link help")
	public void click_on_link_help() {
	  ticketNoPage.helpLink.click();  
	}

	@Then("Confirm title pop-up window {string}")
	public void confirm_title_pop_up_window(String expected) {
	   assertEquals(ticketNoPage.titlePopUp.getText(), expected);
	}

	@Then("Click on submit button go to next page")
	public void click_on_submit_button_go_to_next_page() {
	   ticketNoPage.submitButton.click();
	}

//	@Then("Confirm page title {string}")
//	public void confirm_page_title(String expected) {
//		BrowserUtilities.waitFor(3);
//		BrowserUtilities.waitForPageToLoad(3);
//	  System.out.println(Driver.getDriver().getTitle());
//	  assertEquals(Driver.getDriver().getTitle(), expected);
//	}

	@Then("Confirm error message {string}")
	public void confirm_error_message(String errorMessage) {
		BrowserUtilities.waitForPageToLoad(3);
//		BrowserUtilities.waitFor(3);
	    assertTrue(ticketNoPage.errorMessageTicketNo.getText().contains(errorMessage));
	}

	@Then("Click on each link in Get To Know Us")
	public void click_on_each_link_in_Get_To_Know_Us() {
		BrowserUtilities.waitFor(3);
		
		ticketNoPage.getToKnowUs();
		
	}

}
