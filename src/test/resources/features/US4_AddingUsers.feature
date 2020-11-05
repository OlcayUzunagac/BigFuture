@addUsers
Feature: Librarian should be able to add users


  Scenario: Librarian should be able to add users
  Given the user is on the login page
    And the user enters the librarian information
    And the user is on "Library" page
    When the user clicks Users and enters the page
    And the user clicks Add User
    Then the user fills out user information and clicks "save"

  Scenario: Librarian should be able to add users
    Given the user is on the login page
    And the user enters the librarian information
    And the user is on "Library" page
    When the user clicks Users and enters the page
    And the user clicks Add User
    Then the user clicks Close and cancels the process

  @wip
  Scenario: Librarian should be able to edit user
    Given the user is on the login page
    And the user enters the librarian information
    And the user is on "Library" page
    And the user clicks Users and enters the page
    When the user clicks edit user and edits the user info
    #"save" or "close" options are available
    Then the user can "cloSe" the edited user info
