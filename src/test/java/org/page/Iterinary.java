package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Iterinary extends BaseClass {
	
	public Iterinary() {
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='my_itinerary']")
	private WebElement Itinerary;
	
	public WebElement getMyItinerary() {
		return Itinerary;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='check_all']")
	private WebElement Orderid;
	public WebElement getOrderId() {
		return Orderid;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Cancel Selected']")
	private WebElement CancelSelected;
	public WebElement getCancelSelected() {
		return CancelSelected;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Logout']")
	private WebElement LogOut;
	public WebElement getLogOut() {
		return  LogOut;
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Click here to login again']")
	private WebElement ClickHere;
	public WebElement getClickHere() {
		return   ClickHere;
	}

}
