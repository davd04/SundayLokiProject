@regression @api
Feature: Pet Api Testing

	
	Scenario: Create Pet ID
		Given Create pet upload image
		When Get pet
		Then Delete pet
		
