Feature: User should see modules

  Background:
    Given the user is on the login page

  @studentModules
  Scenario: Student should see 2 modules
    Given the user enters the student information
    And the user is on "Library" page
    When the user should be able to login
    Then Student should see following modules
      | Books           |
      | Borrowing Books |

