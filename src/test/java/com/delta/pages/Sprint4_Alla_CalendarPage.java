package com.delta.pages;


	import java.util.List;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	import com.delta.utilities.BrowserUtilities;
	import com.delta.utilities.Driver;

	public class Sprint4_Alla_CalendarPage {
		public  Sprint4_Alla_CalendarPage () {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy(xpath ="//span[text()='Round Trip']")
		public WebElement TripDropDownbydefault;
		@FindBy (xpath="//div[@class='icon-addon']")
		public WebElement calenderIconClick;
		@FindBy(xpath = "(//table[@class='dl-datepicker-calendar'])[1]//td")
		public List<WebElement> calendarDatesTable1;
		
		@FindBy(xpath = "(//table[@class='dl-datepicker-calendar'])[2]//td")
	     public List<WebElement> calendarDatesTable2;
		@FindBy(xpath="(//div[@class='dl-datepicker-title']/span[1])[1]")
		public WebElement firstTableMonth;
		@FindBy(xpath="(//div[@class='dl-datepicker-title']/span[1])[2]")
		public WebElement secondTableMonth;
		@FindBy(xpath = "(//div[@class='dl-datepicker-title']/span[2])[1]")
		public WebElement calendarYearHeadertable1;

		@FindBy(xpath = "(//div[@class='dl-datepicker-title']/span[2])[2]")
		public WebElement calendarYearHeadertable2;
		@FindBy (xpath="(//span[@class='monthSelector'])[2]")
		public WebElement rightNextButtonCalendar;
	    @FindBy (className="donebutton")
		public WebElement calendarDoneButton;
	    
	    @FindBy (xpath = "//ul[@id='selectTripType-desc']//li")
	    public List <WebElement> selectTripType;

	    
	    
	    public void getSelectTripTypeDropDown(String expectedTrip) {
	    	for(WebElement type :selectTripType) {
	    		String actual = type.getText();
	    		if (actual.equalsIgnoreCase(expectedTrip)) {
	    			System.out.println(actual);
	    			BrowserUtilities.waitFor(2);
	    			type.click();
	    		}
	    	} 
	    }


}
