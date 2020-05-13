package com.delta.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

public class Sprint4_Alla_JoinSkyMilesLogeInPage {
	public Sprint4_Alla_JoinSkyMilesLogeInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "Join SkyMiles")
	public WebElement joinSkyMilesLink;
	@FindBy(xpath = "//h1[text()='Join SkyMiles']")
	public WebElement headerJoinSkyMiles;
	@FindBy(xpath = "//ul[@id='basicInfoGender-menu']/li")
	public List<WebElement> genderDropDown;
	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-triangle-1-s'])[3]")
	public WebElement selectGenderBottun;

	@FindBy(xpath = "//select[@id='basicInfoSuffix']")
	public WebElement slectDropdownSuffix;

	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-triangle-1-s'])[2]")
	public WebElement suffixDropDownButton;
	Actions action = new Actions(Driver.getDriver());

	public void genderdropdownOptions(String expected) {
		for (WebElement option : genderDropDown) {

			BrowserUtilities.waitFor(2);
			if (option.getText().equalsIgnoreCase(expected)) {
				BrowserUtilities.waitFor(2);
				System.out.println(option.getText());
				action.moveToElement(option).click().build().perform();
			}

		}
	}

	public void statiSelectDropDown(String suffixExpected) {
		Select s = new Select(slectDropdownSuffix);
		suffixDropDownButton.click();
		List<WebElement> oSize = s.getOptions();
		BrowserUtilities.waitFor(2);
		int listSize = oSize.size();
		for (int i = 0; i < listSize; i++) {
			BrowserUtilities.waitFor(2);
			String sValue = s.getOptions().get(i).getText();
			// System.out.println(sValue);
			BrowserUtilities.waitFor(2);
			if (sValue.equals(suffixExpected)) {
				BrowserUtilities.waitFor(2);
				s.selectByIndex(i);
				BrowserUtilities.waitFor(2);
				break;
			}
		}
	}

}
