package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_SavedSearchesPage {
	
	public Sprint4_Beck_SavedSearchesPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "my-profile-head")
	public WebElement savedSearchesText;

	@FindBy(id = "reasonTravel1")
	public WebElement reasonTravel;

	@FindBy(xpath = "//label[@for='skyMilesAward1']")
	public WebElement bookSkymiles;
	
	@FindBy(id = "fromCity1")
	public WebElement fromAirportField;

	@FindBy(id = "toCity1")
	public WebElement toAirport;

	@FindBy(id = "depTime1")
	public WebElement depTime;

	@FindBy(id = "retTime1")
	public WebElement retTime;

	@FindBy(id = "passengers1")
	public WebElement passNumber;

	@FindBy(id = "cabin1")
	public WebElement seatClassType;
	
	@FindBy(id = "saveNewTrip1")
	public WebElement saveNewTrip1;
	
	
	
	
	

}
