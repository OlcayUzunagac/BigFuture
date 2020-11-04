@addUsers
Feature: Librarian should be able to add users

@addUserPositive
  Scenario: Librarian should be able to add users
    Given the user enters the librarian information
    And the user is on "Library" page
    When the user clicks "Users" and enters the page
    And the user clicks Add User
    And the user fills out user information and saves changes
    Then the new user is added
