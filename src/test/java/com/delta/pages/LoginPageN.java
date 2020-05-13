package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;



public class LoginPageN {
	public LoginPageN() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="userId")
	public WebElement inputUserName;
	
	@FindBy(id="password")
	public WebElement inputPassword;
	
	@FindBy(xpath="//button[@class='btn btn-danger loginButton']")
	public WebElement loginButton;

}
