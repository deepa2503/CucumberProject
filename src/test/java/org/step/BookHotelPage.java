package org.step;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Then;

public class BookHotelPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	
	
	@Then("User Should fill the fields Details")
	public void userShouldFillTheFieldsDetails() {
	    try {
	    	
	    	SearchHotelPage searchHotel = new SearchHotelPage();
	    	
	    	WebElement firstName = searchHotel.getFirstName();
			base.sendKeys(firstName, "Ida");
			
			WebElement lastName = searchHotel.getLastName();
			base.sendKeys(lastName, "san");
			
			WebElement billAddress = searchHotel.getBillAddress();
			base.sendKeys(billAddress, "London");
			
			
			 WebElement creditCardNo = searchHotel.getCreditCardNo();
			base.sendKeys(creditCardNo, "0202532487792324");
			
			Select s6= new Select(searchHotel.getCreditCardType());
			s6.selectByIndex(1);
			
			Select s7= new Select(searchHotel.getExpiryNo());
			s7.selectByIndex(1);
			
			Select s8= new Select(searchHotel.getExpiryYear());
			s8.selectByIndex(1);

			  WebElement cvvNo = searchHotel.getCvvNo();
				base.sendKeys(cvvNo, "0202");

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User should click Book button")
	public void userShouldClickBookButton() {
	   try {
		   
		   SearchHotelPage searchHotel = new SearchHotelPage();
	    	
		   
		   WebElement bookNow = searchHotel.getBookNow();
			base.click(bookNow);
			
			base.alert("Accept");
			Thread.sleep(2000);
			WebElement bookNow1 = searchHotel.getBookNow();
			base.click(bookNow1);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}
