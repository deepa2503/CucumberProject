Feature: To Verify Adactin Hotel Login Page
	Scenario: To Veify Adactin Hotel Webpage with Valid Credential
	
	Given User should be in Adactin Login Page
	When User should enter Valid Credentials
	And User should click Login button
	Then User should Verify Login success
	
	Scenario: To Verify Adactin hotel Search Hotel WebPage with Valid Credentails
	Given User should be in Adactin Login Page
	When User should enter Valid Credentials
	And User should click Login button
	Then User should Verify Login success
	And User should Select SearchHotel Details
	And User should click Search Button
	
	Scenario:To Verify Select hotel Page
	Given User should be in Adactin Login Page
	When User should enter Valid Credentials
	And User should click Login button
	Then User should Verify Login success
	And User should Select SearchHotel Details
	And User should click Search Button
	And User should click radio button 
	And User should click continue button 
	
	Scenario:To Verify Select Book Hotel Page
	Given User should be in Adactin Login Page
	When User should enter Valid Credentials
	And User should click Login button
	Then User should Verify Login success
	And User should Select SearchHotel Details
	And User should click Search Button
	And User should click radio button 
	And User should click continue button 
	And User Should fill the fields Details
	And User should click Book button
	
	
	Scenario:To Verify Booking Confirmation Page
	Given User should be in Adactin Login Page
	When User should enter Valid Credentials
	And User should click Login button
	Then User should Verify Login success
	And User should Select SearchHotel Details
	And User should click Search Button
	And User should click radio button 
	And User should click continue button 
	And User Should fill the fields Details
	And User should click Book button
	And User should click MyItinerary button
	And User Should click OrderId radio button 
	And User should click cancelSelected button
	Then User should Verify Logout Success
	
	
	
	
	
	
