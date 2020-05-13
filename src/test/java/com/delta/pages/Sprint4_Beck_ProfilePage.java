package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class Sprint4_Beck_ProfilePage {
	
	public Sprint4_Beck_ProfilePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//span[@class='pax-name']")
	public WebElement profileName;
	
	@FindBy(xpath = "//a[text()='Profile']")
	public WebElement profileButton;
	

}
