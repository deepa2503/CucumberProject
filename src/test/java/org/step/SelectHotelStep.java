package org.step;

import org.global.BaseClass;

import org.openqa.selenium.WebElement;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Then;

public class SelectHotelStep extends BaseClass {
	
	public static BaseClass base = new BaseClass();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	
	
	
	
	@Then("User should click radio button")
	public void userShouldClickRadioButton() {
		
		try {
			SearchHotelPage searchHotel = new SearchHotelPage();
			
			WebElement checkBox = searchHotel.getCheckBox();
			base.click(checkBox);
		}
			
		 catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("User should click continue button")
	public void userShouldClickContinueButton() {
		try {
			
			SearchHotelPage searchHotel = new SearchHotelPage();
			WebElement continue1 = searchHotel.getContinue();
			base.click(continue1);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
	
	


	
	
	
