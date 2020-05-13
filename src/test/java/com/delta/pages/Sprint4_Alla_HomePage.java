package com.delta.pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.delta.utilities.Driver;

	public class Sprint4_Alla_HomePage {
		
		
		public Sprint4_Alla_HomePage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy (xpath="//button[text()='Log in']")
		public WebElement login;
		@FindBy (xpath ="//input[@id='userId']")
		public WebElement userName;
		
		@FindBy (xpath="//input[@formcontrolname='lastName']")
		public WebElement lastName;
		
		@FindBy (xpath="//input[@id='password']")
		public WebElement password;
		
		@FindBy (xpath="(//button[@type='submit'])[1]")
		public WebElement logIn2;
		
		@FindBy (xpath="//button[@class='passwordIcon']")
		public WebElement showPasswordIcon;
		
		@FindBy (xpath="//input[@id='persistentLogin_CheckBox']")
		public WebElement keepMeLogInBox;
		
		@FindBy (xpath="(//a[@aria-haspopup='true'])[2]")
		public WebElement logInHelpIcon;
		
		@FindBy (linkText = "Join SkyMiles")
		public WebElement joinSkyMilesLink;

	}

