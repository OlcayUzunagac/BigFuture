@module
Feature: Users should see several modules

  Scenario Outline: User should access modules "<role>"
    Given the user is on the login page
    When the user logs as a "<role>" with "<password>"
    Then the user see "<module1>" "<module2>"

    Examples:
      | role                | password | module1   | module2         |
      | student58@library   | o3imcY1J | Books     | Borrowing Books |
      | student59@library   | MMxtSJFr | Books     | Borrowing Books |
      | student60@library   | G7IFdJ11 | Books     | Borrowing Books |


  Scenario Outline: User should access modules "<role>"
    Given the user is on the login page
    When the user logs as a "<role>" with "<password>"
    Then the user see "<module1>" "<module2>" "<module3>"

    Examples:
      | role                | password | module1   | module2 | module3 |
      | librarian50@library | kAbC7Ybl | Dashboard | Users   | Books   |
