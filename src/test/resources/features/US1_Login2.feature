@login2
Feature: Users should be able to login
	Background:
		Given the user is on the login page

	Scenario Outline: student and librarians can login
		When the user enter "<username>" and "<password>"
		Then the user on the "<page>"
		Examples:
		|username           |password|page   |
		|student58@library  |o3imcY1J|Library|
		|librarian50@library|kAbC7Ybl|Library|
		
		