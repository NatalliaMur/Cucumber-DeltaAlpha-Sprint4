package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;



public class Check_InSkyMilesNumberPage {
	
	public Check_InSkyMilesNumberPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="ui-list-searchType3")
	public WebElement skyMilesNumber;
	
	@FindBy(id="skymilesNumber")
	public WebElement inputSkyMilesNumber;
	
	
	

}
