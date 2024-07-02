package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {      ///construct method
		PageFactory.initElements(driver, this);	
			
		}
		@FindBy(how=How.XPATH,using="//td[@class='login_title']")
		private WebElement searchHotelText;
		
		public WebElement getSearchHotelText() {
			return searchHotelText;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='location']")
	    private WebElement Location;
		public WebElement getLocation() {
			return Location;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='hotels']")
		private WebElement Hotels;
		public WebElement getHotels() {
			return Hotels;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='room_type']")
		private WebElement Roomtype;
		public WebElement getRoomType() {
			return Roomtype;
		}
		
		
		@FindBy(how=How.XPATH,using="//select[@id='room_nos']")
		private WebElement Nor ;
		public WebElement getNoRoom () {
			return Nor;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='datepick_in']")
		private WebElement Checkin ;
		public WebElement getCheckInDate() {
			return Checkin;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='datepick_out']")
		private WebElement Checkout ;
		public WebElement getCheckOut() {
			return Checkout;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='adult_room']")
		private WebElement Adultroom ;
		public WebElement getAdultRoom() {
			return Adultroom;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='child_room']")
		private WebElement Childrenroom ;
		public WebElement getChildrenRoom() {
			return Childrenroom;
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@type='submit']")
		private WebElement Search ;
		public WebElement getSearchButton() {
			return Search;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='radiobutton_0']")
		private WebElement Checkbox ;
		public WebElement getCheckBox() {
			return Checkbox;
		}

		@FindBy(how=How.XPATH,using="//input[@type='submit']")
		private WebElement Continue ;
		public WebElement getContinue() {
			return Continue;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='first_name']")
		private WebElement FirstName ;
		public WebElement getFirstName() {
			return FirstName;
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@id='last_name']")
		private WebElement LastName ;
		public WebElement getLastName() {
			return LastName;
		}
		
		
		@FindBy(how=How.XPATH,using="//textarea[@id='address']")
		private WebElement BillAdd ;
		public WebElement getBillAddress() {
			return BillAdd;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='cc_num']")
		private WebElement Creditno ;
		public WebElement getCreditCardNo() {
			return Creditno;
		}
		
		
		@FindBy(how=How.XPATH,using="//select[@id='cc_type']")
		private WebElement CreditCardType ;
		public WebElement getCreditCardType() {
			return CreditCardType;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='cc_exp_month']")
		private WebElement ExpiryNo ;
		public WebElement getExpiryNo() {
			return  ExpiryNo;
		}
		
		@FindBy(how=How.XPATH,using="//select[@id='cc_exp_year']")
		private WebElement Expiryyear ;
		public WebElement getExpiryYear() {
			return Expiryyear;
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@id='order_no']")
		private WebElement Orderno ;
		public WebElement getOrderno() {
			return Orderno;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='cc_cvv']")
		private WebElement Cvv ;
		public WebElement getCvvNo() {
			return Cvv;
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='book_now']")
		private WebElement Booknow ;
		public WebElement getBookNow() {
			return Booknow;
		}






}
