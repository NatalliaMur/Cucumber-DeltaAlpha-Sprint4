package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_FlightPrefPage {
	
	public Sprint4_Beck_FlightPrefPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "my-profile-head")
	public WebElement flightPrefText;

	@FindBy(id = "prefAirportCd")
	public WebElement prefAirport;

	@FindBy(id = "savePrefDepAirport")
	public WebElement savePrefDepAirport;

	@FindBy(id = "prefSeatType")
	public WebElement select;

	@FindBy(id = "savePrefSeatType")
	public WebElement savePrefSeatType;

	

}
