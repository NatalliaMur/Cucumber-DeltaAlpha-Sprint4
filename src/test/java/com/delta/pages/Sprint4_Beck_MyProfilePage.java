package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_MyProfilePage {
	
	public Sprint4_Beck_MyProfilePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "my-profile-head")
	public WebElement myprofileText;
	
	@FindBy(xpath = "//*[text()='GROUND TRANSPORTATION']/following-sibling::div/a")
	public WebElement groundTransOpenButton;

	@FindBy(xpath = "//*[text()='ACTIVITIES & INTERESTS']/following-sibling::div/a")
	public WebElement activitiesInterOpenButton;

	@FindBy(xpath = "//*[text()='FLIGHT PREFERENCES']/following-sibling::div/a")
	public WebElement flightprefOpenButton;

	@FindBy(xpath = "//*[text()='SAVED SEARCHES']/following-sibling::div/a")
	public WebElement savedSearchesOpenButton;

	

}
