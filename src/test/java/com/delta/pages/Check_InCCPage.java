package com.delta.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;



public class Check_InCCPage {
	Actions actions = new Actions(Driver.getDriver());
	
	public Check_InCCPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@class='nav-link app-link nav-link-check-in']")
	public WebElement checkInLink;
	
	@FindBy(xpath="//span[@class='select-ui-wrapper focusable-element']")
	public WebElement findYourTripByDropDown;
	
	@FindBy(xpath="//ul[@id='searchType-desc']//li[.='Confirmation Number']")
	public WebElement confirmationNuber;
	
	@FindBy(xpath="//ul[@id='searchType-desc']//li[.='Credit Card Number']")
	public WebElement creditCardNumber;
	
	@FindBy(id="creditcardNumber")
	public WebElement creditCardInput;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(xpath="//a[@id='departureAirportLink']")
	public WebElement fromAirport;
	
	@FindBy(xpath="//input[@id='search_input']")
	public WebElement inputAirport;
	
	public WebElement getOptionsFindYourTrip(String option) {
		String xpathCustom = "//ul[@id='searchType-desc']//li[.='"+option+"']";
		return Driver.getDriver().findElement(By.xpath(xpathCustom));
	}
	
	public void getElement() {
		List<WebElement> list = Driver.getDriver().findElements(By.xpath("//ul[@id='searchType-desc']//li"));
		
		for (int i = 1; i < list.size(); i++) {
			list = Driver.getDriver().findElements(By.xpath("//ul[@id='searchType-desc']//li"));
			BrowserUtilities.waitFor(1);
			list.get(i-1).click();
		}
	}
	public void getElement1() {
		List<WebElement> list = Driver.getDriver().findElements(By.xpath("//ul[@id='searchType-desc']//li"));
		
		for (int i = 1; i <=list.size(); i++) {
			findYourTripByDropDown.click();
			list = Driver.getDriver().findElements(By.xpath("//ul[@id='searchType-desc']//li"));
			System.out.println(list.get(i-1).getText());
			
			BrowserUtilities.waitFor(2);
			actions.moveToElement(list.get(i-1)).click().build().perform();
		}
	}
	
	
	public void listFromAirport(String fromAirport) {
		String toUpCase = fromAirport.substring(0, 1).toUpperCase() + fromAirport.substring(1);

		List<WebElement> list = Driver.getDriver()
				.findElements(By.xpath("//div[@class='search-result-container']//ul//li"));

		for (WebElement element : list) {
			if (element.getText().contains(toUpCase)) {
				System.out.println(element.getText());
				element.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
}
