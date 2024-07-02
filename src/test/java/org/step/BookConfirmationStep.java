package org.step;

import org.global.BaseClass;

import org.openqa.selenium.WebElement;
import org.page.Iterinary;

import io.cucumber.java.en.Then;

public class BookConfirmationStep extends BaseClass {
	
	public static BaseClass base = new BaseClass();
	public static  Iterinary booked = new Iterinary();
	
	
	
	@Then("User should click MyItinerary button")
	public void userShouldClickMyItineraryButton() {
	    try {
	    	
	    	Iterinary booked = new Iterinary();
	    	WebElement myItinerary = booked.getMyItinerary();
	    	base.click(myItinerary);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User Should click OrderId radio button")
	public void userShouldClickOrderIdRadioButton() {
	    try {
	    	Iterinary booked = new Iterinary();
	    	WebElement orderId = booked.getOrderId();
	    	base.click(orderId);
	    	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User should click cancelSelected button")
	public void userShouldClickCancelSelectedButton() {
	    try {
	    	Iterinary booked = new Iterinary();
	    	WebElement cancelSelected = booked.getCancelSelected();
	    	base.click(cancelSelected);
	    	
	    	
	           base.alert("Accept");
	    	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User should Verify Logout Success")
	public void userShouldVerifyLogoutSuccess() {
	    try {
	    	
	    	Iterinary booked = new Iterinary();
	    	
	    	WebElement logOut = booked.getLogOut();
	    	base.click(logOut);

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}



}
