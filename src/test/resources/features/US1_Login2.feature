@login2
Feature: Users should be able to login
	Background:
		Given the user is on the login page

	Scenario: Login as a student
		When the user enters the student information
		Then the user is on "Library" page


	Scenario: Login as a librarian
		When the user enters the librarian information
		Then the user is on "Library" page



		
		