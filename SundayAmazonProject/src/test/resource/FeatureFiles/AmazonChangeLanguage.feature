@regression @smoke @us-245
Feature: Amazon Change Language Functionality

	Background: 
		Given Open Amazon Homepage
	
	Scenario: Change Language
		Given Open Amazon Homepage
		When mouse hover over language
		And click Spanish
		Then webpage should reload in Spanish