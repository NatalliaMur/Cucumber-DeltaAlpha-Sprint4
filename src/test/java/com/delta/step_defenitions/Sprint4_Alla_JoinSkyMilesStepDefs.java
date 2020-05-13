package com.delta.step_defenitions;



import org.apache.log4j.Logger;

import com.delta.pages.Sprint4_Alla_JoinSkyMilesLogeInPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.LoggerUtils;

import io.cucumber.java.en.Then;


public class Sprint4_Alla_JoinSkyMilesStepDefs {
	Sprint4_Alla_JoinSkyMilesLogeInPage joinSkyMiles = new Sprint4_Alla_JoinSkyMilesLogeInPage();
	Logger logger = LoggerUtils.getLogger( Sprint4_Alla_JoinSkyMilesStepDefs.class);
	
	@Then("User click on Join SkyMiles link")
	public void user_click_on_Join_SkyMiles_link() {
      joinSkyMiles.joinSkyMilesLink.click();
	   
	}

	@Then("The header of  the page should be {string}")
	public void the_header_of_the_page_should_be(String expected) {
	  String actual= joinSkyMiles.headerJoinSkyMiles.getText();
	  System.out.println(actual);
	  //assertEquals(expected, actual);
	}
	
	@Then("User clicks Gender dropdown")
	public void user_clicks_Gender_dropdown() {
		BrowserUtilities.waitFor(2);
		joinSkyMiles.selectGenderBottun.click();
		BrowserUtilities.waitFor(2);
	}

	@Then("User chooses {string} from gender dropdown")
	public void user_chooses_from_gender_dropdown(String expected) {
		BrowserUtilities.waitFor(2);
		joinSkyMiles.genderdropdownOptions(expected);
		System.out.println(expected);
		BrowserUtilities.waitFor(2);
		logger.info("Gender dropdown");
		
		

	}
	
	@Then("User selects {string} from the dropDown")
	public void user_selects_from_the_dropDown(String suffixExpected) {
		BrowserUtilities.waitFor(2);
	   joinSkyMiles.statiSelectDropDown(suffixExpected);
	   System.out.println(suffixExpected);
	   BrowserUtilities.waitFor(2);
	}

}
