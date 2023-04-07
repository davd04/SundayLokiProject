@regression @api
Feature: Petstore API Testing

Scenario: Pet CRUD API
	
	Given Create pet
	When Get pet
	And Update pet
	And Get pet
	Then Delete pet