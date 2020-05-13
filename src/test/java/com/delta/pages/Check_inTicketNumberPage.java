package com.delta.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;



public class Check_inTicketNumberPage {
	Actions actions = new Actions(Driver.getDriver());
	public Check_inTicketNumberPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="ui-list-searchType2")
	public WebElement ticketNumber;
	
	@FindBy(xpath="//div//input[@id='eticketNumber']")
	public WebElement inputTicketNo;
	
	@FindBy(xpath="//a[@class='checkin-ticketno-help icon-help circle-outline']")
	public WebElement helpLink;
	
	@FindBy(xpath="//h4[@class='title']")
	public WebElement titlePopUp;
	
	@FindBy(xpath="//button[@class='help-modal-close icon-moreoptionsclose float-right circle-outline']")
	public WebElement closePopUp;
	
	@FindBy(xpath="//a[@id='departureAirportLink']")
	public WebElement fromAirport;
	
	@FindBy(xpath="//div//input[@id='search_input']")
	public WebElement inputAirport;
	
	public void listFromAirport(String fromAirport) {
		String toUpCase = fromAirport.substring(0, 1).toUpperCase() + fromAirport.substring(1);

		List<WebElement> list = Driver.getDriver() //div[@class='search-results d-none pl-1 d-block']//ul//li
				.findElements(By.xpath("//div[@class='search-results d-none pl-1 d-block']//ul//li"));

		for (WebElement element : list) {
			if (element.getText().contains(toUpCase)) {
				System.out.println(element.getText());
				element.click();
				break;
			}
		}
	}

	@FindBy(xpath="//button[@id='btn-checkin-submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//div[@id='landingPageBackEndErrors']")
	public WebElement errorMessageTicketNo;
	
	@FindBy(linkText ="About Delta")
	public WebElement aboutDelta;
	
	@FindBy(linkText ="Careers")
	public WebElement careers;
	
	@FindBy(linkText="News Hub")
	public WebElement newsHub;
	
	@FindBy(linkText="Legal")
	public WebElement legal;
	
	@FindBy(linkText="Cookies, Privacy & Security")
	public WebElement cookiesPrivacySecurity;
		
	@FindBy(linkText="Corporate Travel")
	public WebElement corporateTravel;
	
	@FindBy(linkText="Travel Agents")
	public WebElement travelAgents;
	
	@FindBy(linkText="Accessibility")
	public WebElement accessibility;
	
	@FindBy(linkText="Human Trafficking Statement")
	public WebElement humanTraffickingStatement;
	
	@FindBy(linkText="Site Map")
	public WebElement siteMap;
	
	@FindBy(xpath="//div[@class='grid_3 managed-col1']//ul//li")
	public List<WebElement> listGetToKnowUs;
	
	public void getListToKnowUs() {
		List <WebElement> list = listGetToKnowUs;
		
		for (int i = 1; i < list.size(); i++) {
			BrowserUtilities.waitFor(3);
			list = listGetToKnowUs;
			System.out.println(list.get(i-1).getText());
			System.out.println("1");
			BrowserUtilities.waitForClickablility(list.get(i-1), 3);;
			actions.moveToElement(list.get(i-1)).click().build().perform();
			System.out.println("2");
			BrowserUtilities.waitForPageToLoad(2);
			Driver.getDriver().navigate().back();
		}
	}
	
	public void getToKnowUs() {
			
		aboutDelta.click();
		Driver.getDriver().navigate().back();
		careers.click();
		Driver.getDriver().navigate().back();
		newsHub.click();
		Driver.getDriver().navigate().back();
		legal.click();
		Driver.getDriver().navigate().back();
		cookiesPrivacySecurity.click();
		Driver.getDriver().navigate().back();
		corporateTravel.click();
		Driver.getDriver().navigate().back();
		
		String parentWindow = Driver.getDriver().getWindowHandle();
		travelAgents.click();
		Set<String> windowHandles = Driver.getDriver().getWindowHandles();
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindow)) {
				Driver.getDriver().switchTo().window(handle);
			}
		}
		Driver.getDriver().getWindowHandle();
		Driver.getDriver().close();		
		Driver.getDriver().switchTo().window(parentWindow);
		
		accessibility.click();
		Driver.getDriver().navigate().back();
//		humanTraffickingStatement.click();
//		Driver.getDriver().navigate().back();
		siteMap.click();
		Driver.getDriver().navigate().back();
	}
	
	
	
	

}
