@addUsers
Feature: Librarian should be able to add users

@wip
  Scenario: Librarian should be able to add users
  Given the user is on the login page
    And the user enters the librarian information
    And the user is on "Library" page
    When the user clicks Users and enters the page
    And the user clicks Add User
    Then the user fills out user information and creates a user

