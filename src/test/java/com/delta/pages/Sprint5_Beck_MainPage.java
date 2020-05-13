package com.delta.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Sprint5_Beck_MainPage {

	public Sprint5_Beck_MainPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[text()='Vacation Deals']")
	public WebElement vacationDeals;

	@FindBy(xpath = "//a[contains(text(), 'Shop Hotels')]")
	public WebElement shopHotels;

	@FindBy(xpath = "//*[text()='Rent a Car']")
	public WebElement rentCar;

	@FindBy(xpath = "(//a[contains(text(), 'Gift Cards')])[2]")
	public WebElement giftCards;

	@FindBy(id = "fromAirport")
	public WebElement origin;

	@FindBy(id = "toAirport")
	public WebElement destionation;

	@FindBy(id = "dialogInput")
	public WebElement SearchBox;

	@FindBy(xpath = "//*[@class=\"mat-option-text\"]")
	public List<WebElement> aiportSearchResultList;

	@FindBy(xpath = "(//*[contains(text(), 'Delta Vacations')])[3]")
	public WebElement deltaVacationsText;

	@FindBy(xpath = "////button[@class='cookie-close-icon float-right circle-outline']")
	public WebElement cookie;

	@FindBy(id = "vacationsDepartureDate")
	public WebElement calendarDepartureBox;

	@FindBy(id = "vacationsReturnDate")
	public WebElement calendarReturnBox;

	@FindBy(xpath = "(//*[@class=\"mat-button-wrapper\"])[1]")
	public WebElement calendarMonthYear;

	@FindBy(xpath = "//*[@class='mat-calendar-next-button mat-icon-button']")
	public WebElement calendarNextButton;

	@FindBy(xpath = "//tbody//td")
	public List<WebElement> calendardates;

	public void chooseDate(String date, String month, String year) {
		String monthYear = month+" "+year;
		System.out.println(monthYear);
	outer:	while (true) {		
			if (calendarMonthYear.getText().trim().contains(monthYear)) {
				System.out.println("55555");
				
				for (WebElement dt : calendardates) {
					System.out.println(dt.getText());
					if (dt.getText().trim().equalsIgnoreCase("20")) {
						System.out.println("333");
						dt.click();
						break outer;
					}
				}
			} else {
				calendarNextButton.click();
			}

		}

	}

	public void cookieDecline() {
		try {
			cookie.click();
		} catch (ElementNotFoundException e) {
		}
	}

	public void chooseOriginAirport(String cityname, String airportName) {
		origin.click();
		BrowserUtilities.waitFor(2);
		SearchBox.click();
		BrowserUtilities.waitFor(1);
		SearchBox.sendKeys(cityname);
		BrowserUtilities.waitFor(4);
		for (WebElement name : aiportSearchResultList) {
			if (name.getText().contains(airportName)) {
				name.click();
				break;
			}

		}

	}

	public void chooseDestinationAirport(String cityname, String airportName) {
		destionation.click();
		BrowserUtilities.waitFor(2);
		SearchBox.click();
		BrowserUtilities.waitFor(1);
		SearchBox.sendKeys(cityname);
		BrowserUtilities.waitFor(4);
		for (WebElement name : aiportSearchResultList) {
			if (name.getText().contains(airportName)) {
				name.click();
				break;
			}

		}

	}

}
