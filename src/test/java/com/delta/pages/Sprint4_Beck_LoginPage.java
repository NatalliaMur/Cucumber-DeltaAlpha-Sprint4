package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class Sprint4_Beck_LoginPage {
	
	public Sprint4_Beck_LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id = "userId")
	public WebElement usernameField;

	@FindBy(id = "lastName")
	public WebElement lastnameField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//form//div//button[@type='submit']")
	public WebElement submitButton;

}
