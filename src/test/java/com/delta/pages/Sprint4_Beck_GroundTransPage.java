package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_GroundTransPage {
	
	public Sprint4_Beck_GroundTransPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "my-profile-head")
	public WebElement groundTransText;

	@FindBy(id = "carservicelimo")
	public WebElement select;

	@FindBy(id = "saveGroundTransport")
	public WebElement saveGroundTransport;

	@FindBy(id = "carService")
	public WebElement savedChoice;
	
}
