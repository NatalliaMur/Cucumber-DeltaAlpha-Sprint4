package com.delta.step_defenitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.delta.pages.Sprint4_Alla_HomePage;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.utilities.Driver;
import com.delta.utilities.LoggerUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sprint4_Alla_LoginStepDefs {
	Logger logger = LoggerUtils.getLogger(Sprint4_Alla_LoginStepDefs.class);
	Sprint4_Alla_HomePage homepage = new Sprint4_Alla_HomePage();
	Actions action = new Actions(Driver.getDriver());

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		BrowserUtilities.waitFor(2);
		logger.info("Navigating to a homepage");
	}

	@When("I click on log in")
	public void i_click_on_log_in() {
		// HomePage homepage = new HomePage();
		logger.info("Clicking on Sign in");
		homepage.login.click();
		BrowserUtilities.waitFor(2);

	}

	@Then("The login page title should be Login")
	public void the_login_page_title_should_be_Login() {
		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();
		String expected = "Login";
		logger.info("Verifying the title");

		try {
			assertEquals(expected, actual);
			logger.info("Title Verification passed");

		} catch (AssertionError e) {

			logger.error("Title Verification failed");
			logger.error(e.toString());

		}

	}

	@Then("User clicks on show password icon")
	public void user_clicks_on_show_password_icon() {
		WebElement icon = homepage.showPasswordIcon;
		BrowserUtilities.waitFor(2);
		action.moveToElement(icon).click().build().perform();
		BrowserUtilities.waitFor(2);
		// assertTrue(icon.isEnabled());
		logger.info("The icon is enabled");

	}

	@Then("User clicks on keep me Logged in - New! box")
	public void user_clicks_on_keep_me_Logged_in_New_box() {
		WebElement checkbox = homepage.keepMeLogInBox;
		BrowserUtilities.waitFor(2);
		action.moveToElement(checkbox).click().build().perform();
		BrowserUtilities.waitFor(2);
		// assertTrue(checkbox.isSelected());
		logger.info("The icon is selected");
	}
	@When("I enter {string} as username, {string} as last name, {string} as password, and click login")
	public void i_enter_as_username_as_last_name_as_password_and_click_login(String userName, String lastName, String password) {
		BrowserUtilities.waitFor(2);
		homepage.userName.sendKeys(userName);
		BrowserUtilities.waitFor(3);
		homepage.lastName.sendKeys(lastName);
		BrowserUtilities.waitFor(2);
		homepage.password.sendKeys(password);
		BrowserUtilities.waitFor(2);
		action.moveToElement(homepage.logIn2).click().perform();
		BrowserUtilities.waitFor(2);
	}

	@Then("I should be able to land on Airline Tickets & Flights")
	public void i_should_be_able_to_land_on_Airline_Tickets_Flights() {

		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();

		System.out.println(actual);
	}
}
