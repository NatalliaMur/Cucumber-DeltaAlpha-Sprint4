package com.delta.step_defenitions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

import com.delta.pages.Check_InSkyMilesNumberPage;
import com.delta.pages.LoginPageN;
import com.delta.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;

public class Check_InSkyMilesNumberStepDefsN {
	Check_InSkyMilesNumberPage skyMPage = new Check_InSkyMilesNumberPage();
	Logger logger = Logger.getLogger(Check_InSkyMilesNumberStepDefsN.class);
	
	@Then("Choose SkyMiles Number in dropdown box")
	public void choose_SkyMiles_Number_in_dropdown_box() {
		BrowserUtilities.waitFor(1);
		skyMPage.skyMilesNumber.click();
	    
	}

	@Then("Enter SkyMiles Number {string}")
	public void enter_SkyMiles_Number(String skyNumber) {
		BrowserUtilities.waitFor(2);
	  skyMPage.inputSkyMilesNumber.sendKeys(skyNumber); 
	}
	
	@Then("I enter the following credentials, I should be able to login")
	public void i_enter_the_following_credentials_I_should_be_able_to_login(Map<String, String> userPassw) {
		LoginPageN logPageN = new LoginPageN();
		Set<Entry<String, String>> entrySet = userPassw.entrySet();
		BrowserUtilities.waitFor(4);
		for (Entry<String, String> entry : entrySet) {
			String user  = entry.getKey();
			String passw = entry.getValue();
			logPageN.inputUserName.sendKeys(user);
			logPageN.inputPassword.sendKeys(passw);
			logPageN.loginButton.click();
			
		}
		
	}
	
	


}
