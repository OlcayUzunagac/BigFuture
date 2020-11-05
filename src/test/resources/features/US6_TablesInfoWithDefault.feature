@EUG13-188
Feature: Tables info

  Scenario Outline: User logged in as a student
    Given The user logged in as a "<userType>" and "<password>"
    Examples:
      | userType          | password |
      | student58@library | o3imcY1J |
      | student59@library | MMxtSJFr |
      | student60@library | G7IFdJ11 |

  Scenario Outline: Tables with default info
    Given The table should have following column "<name>"
    Examples:
      | name     |
      | ISBN     |
      | Name     |
      | Author   |
      | Category |
      | Year     |


