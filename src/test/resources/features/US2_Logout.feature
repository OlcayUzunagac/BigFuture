@logout
Feature: User should be able to logout

  Scenario Outline: User logout from application
    Given the user is on the login page
    When the user logs as a "<role>" with "<password>"
    When the user click his name and logout
    Then the user should be on login page

    Examples:
      | role                | password |
      | student58@library   | o3imcY1J |
      | student59@library   | MMxtSJFr |
      | student60@library   | G7IFdJ11 |
      | librarian50@library | kAbC7Ybl |


