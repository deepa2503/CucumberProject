package org.step;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Then;

public class SearchHotelStep extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	
	@Then("User should Select SearchHotel Details")
	public void userShouldSelectSearchHotelDetails() {
	    try {
	    	
	    	SearchHotelPage searchHotel = new SearchHotelPage();
			Select s = new Select(searchHotel.getLocation());
			s.selectByValue("London");
			Select s1= new Select(searchHotel.getHotels());
			s1.selectByValue("Hotel Creek");
			Select s2= new Select(searchHotel.getRoomType());
			s2.selectByValue("Double");
			Select s3 = new Select(searchHotel.getNoRoom());
			s3.selectByIndex(3);
			WebElement checkInDate = searchHotel.getCheckInDate();
			base.sendKeys(checkInDate, "25/07/2024");
			WebElement checkOut = searchHotel.getCheckOut();
			base.sendKeys(checkOut, "17/07/2024");
			Select s4 = new Select(searchHotel.getAdultRoom());
			s4.selectByIndex(3);
			Select s5 = new Select(searchHotel.getChildrenRoom());
			s5.selectByIndex(3);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User should click Search Button")
	public void userShouldClickSearchButton() {
	    try {
	    	SearchHotelPage searchHotel = new SearchHotelPage();
	    	
	    	WebElement searchButton = searchHotel.getSearchButton();
			base.click(searchButton);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
