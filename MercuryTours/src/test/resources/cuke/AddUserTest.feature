Feature: Register
As a person
I want to generate a new account
So that I can login and make purchases

	Scenario: Create an account
		Given the right web address
		And I can navigate to the 'Register' page
		When I fill all fields using the following information
		|	FirstName	|	LastName	|	Phone	|	mail		|
		|	Elena		|	Castilla	|07111111111|hi@gmail.com	|
		
		|	Address		|	City		|	State	|	PostalCode	|
		|18 Somewhere	|	London		|	London	|	WX 0XX		|
		
		|	Username	|	Password	|			|				|
		|	root		|	root		|			|				|
		Then I can login as a new user using
		|	Username	|	Password	|
		|	root		|	root		|