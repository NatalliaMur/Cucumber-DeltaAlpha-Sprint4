package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_ActivityInterPage {
	
	public Sprint4_Beck_ActivityInterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "my-profile-head")
	public WebElement actInterText;

	@FindBy(xpath = "//label[@for='Attractions']")
	public WebElement attractions;

	@FindBy(xpath = "//label[@for='AirAdventures']")
	public WebElement airAdventures;
	
	@FindBy(id = "saveActivities")
	public WebElement saveActivities;
	

}
