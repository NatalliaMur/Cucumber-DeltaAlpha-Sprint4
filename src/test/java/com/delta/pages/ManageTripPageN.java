package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class ManageTripPageN {
	public ManageTripPageN() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="headPrimary3")
	public WebElement manageMyTripLink;
	
	@FindBy(xpath="//span[@class='select-ui-wrapper focusable-element']")
	public WebElement findYTripByDropDown;
	
	@FindBy(id="ui-list-searchOption0")
	public WebElement confirmationNumber;
	
	@FindBy(id="fb-conf-num")
	public WebElement inputConfNumber;
	
	@FindBy(id="fb-conf-lastname")
	public WebElement inputLastName;
	
	@FindBy(xpath="//a[@class='hotel-resrv-link icon-Dropdown-caret last-focusable-element']")
	public WebElement hotelReservButton;
	
	@FindBy(name="findBooking")
	public WebElement findBookingButton;
	
	@FindBy(id="nucaptcha-media")
	public WebElement characters;
	
	@FindBy(xpath="//div[@id='empty-result-error']//p")
	public WebElement emptyResultError;
	
	@FindBy(id="nucaptcha-answer")
	public WebElement inputEnterChars;
	
	
	
	
	

}
