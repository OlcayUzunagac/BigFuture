@login
Feature: Users should be able to login

  Scenario Outline: Login as "<role>"
    Given the user is on the login page
    When the user logs as a "<role>" with "<password>"
    Then the title should be "<page>"

    Examples:
      | role                | password | page      |
      | student58@library   | o3imcY1J | Books     |
      | student59@library   | MMxtSJFr | Books     |
      | student60@library   | G7IFdJ11 | Books     |
      | librarian50@library | kAbC7Ybl | Dashboard |