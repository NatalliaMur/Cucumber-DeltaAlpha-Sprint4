package com.delta.step_defenitions;


	import static org.junit.Assert.assertEquals;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	import com.delta.pages.Sprint4_Alla_CalendarPage;
	import com.delta.pages.Sprint4_Alla_HomePage;
	import com.delta.utilities.BrowserUtilities;
	import com.delta.utilities.Driver;
	import com.delta.utilities.LoggerUtils;
	import static org.junit.Assert.assertEquals;

	import io.cucumber.java.en.Then;

	public class Sprint4_Alla_CalendarStepDefs {
		Sprint4_Alla_CalendarPage calendarP = new Sprint4_Alla_CalendarPage();
		Logger logger = LoggerUtils.getLogger(Sprint4_Alla_CalendarStepDefs.class);
		Actions action = new Actions (Driver.getDriver());
		
		
		@Then("User checks dropdown is {string} by default")
		public void user_checks_dropdown_is_by_default(String expected) {
			String actual =calendarP.TripDropDownbydefault.getText();
			BrowserUtilities.waitFor(2);
		assertEquals(expected, actual);
			logger.info("The default dropdown text is correct");}
			
			@Then("User selects trip type {string}")
			public void user_selects_trip_type(String string) {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			 
		}
			@Then("User pickes departure  Month {string} and departure year {string} and departure date {string}")
			public void user_pickes_departure_Month_and_departure_year_and_departure_date(String departuremonth, String departureyear, String departuredate) {
				BrowserUtilities.waitFor(2);
				calendarP.calenderIconClick.click();
				logger.info("Calendar was enabled");
				String firstTableMonth=calendarP.firstTableMonth.getText(); 
				String firstTableYear = calendarP.calendarYearHeadertable1.getText().toString();
				String secondTableMonth=calendarP.secondTableMonth.getText();
				String secondTableYear = calendarP.calendarYearHeadertable1.getText().toString();
				
			
				if (firstTableMonth.equalsIgnoreCase(departuremonth) && firstTableYear.equalsIgnoreCase(departureyear)) {
					BrowserUtilities.waitFor(2);
					System.out.println("in the first loop");
					for (WebElement ele: calendarP.calendarDatesTable1) {
						String date = ele.getText();
						BrowserUtilities.waitFor(2);
						System.out.println("date" + date);
						if (date.equalsIgnoreCase(departuredate)) {
							BrowserUtilities.waitFor(2);
							ele.click();
							break;
						}
					}
					}
				else if ( secondTableMonth.equalsIgnoreCase(departuremonth) && secondTableYear.equalsIgnoreCase(departureyear)) {
					System.out.println("in the second loop");
					BrowserUtilities.waitFor(2);
					for (WebElement ele: calendarP.calendarDatesTable2) {
						String date = ele.getText().toString();
						
						System.out.println("date" + date);
						BrowserUtilities.waitFor(2);
						if (date.equalsIgnoreCase(departuredate)) {
							BrowserUtilities.waitFor(2);
							ele.click();
							break;
						}
					}	
				}else {
					BrowserUtilities.waitFor(2);
					calendarP.rightNextButtonCalendar.click();	
				}
				BrowserUtilities.waitFor(2);
			    action.moveToElement(calendarP.calendarDoneButton).click();
			
				
				
				}
			

			@Then("User pickes arrivel  Month {string} and arrivel year {string} and arrivel date {string}")
			public void user_pickes_arrivel_Month_and_arrivel_year_and_arrivel_date(String arrivelmonth, String arrivelyear, String arriveldate) {
			  
			}

		@Then("User clickes done button")
		public void user_clickes_done_button() {
		    
		}
		}

