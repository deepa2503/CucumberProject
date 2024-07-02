package org.step;

import java.util.concurrent.TimeUnit;

import org.global.BaseClass;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	
	public static BaseClass base = new BaseClass();
	public static LoginPage loginpage = new LoginPage();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	
	@Given("User should be in Adactin Login Page")
	public void user_should_be_in_adactin_login_page() {
		String BrowserType = "";
	       try {
			
				base.getDriver(base.readExcel(0, 1));
				String readExcel = base.readExcel(0,1);
				System.out.println(BrowserType +"Browser Launched Successfully" );
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				base.getUrl(base.readExcel(1, 1));
				  if(base.getCurrentUrl().equals(base.readExcel(1, 1))) {
					  System.out.println("Url Launched successful");
				  }else {
					  
					  base.getUrl(base.readExcel(1, 1));
				
			}
			}
			catch(SessionNotCreatedException e) {
				System.out.println(BrowserType +"Browser Not Launched Successfully");
				
			}
			catch(WebDriverException e) {
				System.out.println(BrowserType +"Browser Not Launched Successfully");
			}
			catch(Exception e) {
				System.out.println(BrowserType +"URl Not Launched Successfully");
				
			}
			
		
	
			try {
				LoginPage loginpage = new LoginPage();
//				WebElement loginUserText = loginpage.getLoginUserText();
//				boolean displayed = loginUserText.isDisplayed();
				if(loginpage.getLoginUserText().isDisplayed()) {
//					WebElement loginUserText = loginpage.getLoginUserText();
//					String text = loginUserText.getText();
					System.out.println("User is in " +loginpage.getLoginUserText().getText());
				}
	
	}
			catch(Exception e) {
				
			}
	}

	@When("User should enter Valid Credentials")
	public void user_should_enter_valid_credentials() {
		try {
			LoginPage loginpage = new LoginPage();
			
			loginpage.getUserName().sendKeys(base.readExcel(2, 1));
			loginpage.getPassword().sendKeys(base.readExcel(3, 1));
			
		} catch (Exception e) {
			System.out.println("User is not in" +loginpage.getLoginUserText().getText());
		}
	}

	@When("User should click Login button")
	public void user_should_click_login_button() {
	try {
		LoginPage loginpage = new LoginPage();
		
		WebElement loginButton = loginpage.getLoginButton();
		if(loginButton.isDisplayed()) {
			System.out.println(loginButton.getAttribute("value") + "login button is Enbaled");
			base.click(loginButton);
		}
		
	} catch (Exception e) {
		System.out.println("User is not in" +loginpage.getLoginUserText().getText());
	}
	}

	@Then("User should Verify Login success")
	public void user_should_verify_login_success() {
		try {
			searchHotel = new SearchHotelPage();
			if(searchHotel.getSearchHotelText().isDisplayed()) {
				System.out.println("search hotel page displayed successfully" + searchHotel.getSearchHotelText().getText());
			}
			
			
		} catch (Exception e) {
			System.out.println("Search hotel page is not displayed");
		}
	}
}
