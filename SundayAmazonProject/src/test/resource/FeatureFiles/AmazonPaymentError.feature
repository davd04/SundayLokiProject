@regression @smoke @us-244
Feature: Amazon Payment Error Functionality

	Background: 
		Given Open Amazon Homepage
	
	Scenario: Sign In for payment error options
		Given Open Amazon Homepage
		When click on Help
		And click on Payment, charges or gift cards
		Then user should be asked to Sign In