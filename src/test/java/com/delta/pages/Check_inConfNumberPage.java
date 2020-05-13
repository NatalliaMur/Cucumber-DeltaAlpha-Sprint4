package com.delta.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;



public class Check_inConfNumberPage {
	
Actions actions = new Actions(Driver.getDriver());
	
	public Check_inConfNumberPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@id='searchType-desc']//li[.='Confirmation Number']")
	public WebElement confirmationNuber;
	
	@FindBy(id="confirmationNumber")
	public WebElement inputConfirmNo;
	
	@FindBy(id="confirmationNumber-error")
	public WebElement errorMessage;
	
	@FindBy(xpath="//a[@class='checkin-ticketno-help icon-help circle-outline']")
	public WebElement helpLink;
	
	@FindBy(id="modalTitle")
	public WebElement titlePopUp;
	
	@FindBy(xpath="//button[@class='help-modal-close icon-moreoptionsclose float-right circle-outline']")
	public WebElement closePopUp;
	
	@FindBy(xpath="//a[@class='departCity form-control mb-2 mb-sm-0']")
	public WebElement fromAirport;
	
	@FindBy(xpath="//input[@id='search_input']")
	public WebElement inputAirport;
	
	public void listFromAirport(String fromAirport) {
		String toUpCase = fromAirport.substring(0, 1).toUpperCase() + fromAirport.substring(1);

		List<WebElement> list = Driver.getDriver()
				.findElements(By.xpath("//div[@class='search-results d-none pl-1 d-block']//ul//li"));

		for (WebElement element : list) {
			if (element.getText().contains(toUpCase)) {
				System.out.println(element.getText());
				element.click();
				break;
			}
		}
	}
	@FindBy(linkText="Mobile Apps")
	public WebElement mobileApps;
	
	@FindBy(xpath="//a[@class='connect-facebook']")
	public WebElement facebook;
	
	@FindBy(xpath="//a[@class='connect-twitter']")
	public WebElement twitter;
	
	public void facebookWindow() {
		BrowserUtilities.waitFor(2);
		mobileApps.click();
		Driver.getDriver().navigate().back();
		
		BrowserUtilities.waitFor(2);
		String parentWindow = Driver.getDriver().getWindowHandle();
		facebook.click();
		BrowserUtilities.waitFor(2);
		Set<String> windowHandles = Driver.getDriver().getWindowHandles();
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindow)) {
				Driver.getDriver().switchTo().window(handle);
			}
		}
		Driver.getDriver().getWindowHandle();
		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(parentWindow);
		
	}
	public void twitterWindow() {
		
		String parentWindow = Driver.getDriver().getWindowHandle();
		BrowserUtilities.waitForClickablility(twitter, 5);
		System.out.println("1");
		
		WebElement elementToClick = Driver.getDriver().findElement(By.xpath("//li//a[@class='connect-twitter']"));
		((JavascriptExecutor)Driver.getDriver()).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
		((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].checked = true;", elementToClick);
//		Driver.getDriver().findElement(By.xpath("//a[@class='connect-twitter']")).click();
//		twitter.click();
		BrowserUtilities.waitFor(5);
		System.out.println("2");
		Set<String> windowHandles = Driver.getDriver().getWindowHandles();
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindow)) {
				Driver.getDriver().switchTo().window(handle);
			}
		}
		Driver.getDriver().getWindowHandle();
		System.out.println("3");
		BrowserUtilities.waitFor(5);
//		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(parentWindow);
	}

}
