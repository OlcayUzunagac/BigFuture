Feature: Logout Function

  @wip
  Scenario Outline: Successful logout from page

    Given the user logged in as "<user type>"
    When the user click on log out button
    Then the page title should be "Login - Library"
    Examples:
      | user type |
      | Student   |
      | Librarian |


