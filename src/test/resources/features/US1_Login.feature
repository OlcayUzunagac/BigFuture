@login2
Feature: Users should be able to login
	Background:
		Given the user is on the login page
	@student
	Scenario: Login as a student
		When the user enters the student information
		Then the user is on "Library" page

	@librarian
	Scenario: Login as a librarian
		When the user enters the librarian information
		Then the user is on "Library" page

	@invalid
	Scenario: Login with invalid credentials
		When the user enters an invalid information
		Then the user is "Login - Library" page



		
		