@regression @smoke @us-246
Feature: Amazon Gift Card Functionality


	Background: 
		Given Open Amazon Homepage
	
	Scenario: Amazon Gift Card
		Given Open Amazon Homepage
		When click on Gift Cards
		And click on eGift Cards
		And select Gift Card Design
		And select Design
		And select amount
		And select delivery
		And select to
		And select from
		And select message
		And select quantity
		And select delivery date
		Then add to cart
		