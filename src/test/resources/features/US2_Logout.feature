Feature: Logout Function

  @wip
  Scenario Outline: Successful logout from page

    Given I am logged in as "<user type>"
    When I click on log out button
    Then the page title should be "Login - Library"
    Examples:
      | user type |
      | Student   |
      | Librarian |


