@EUG13-188
Feature: Tables info

  Scenario Outline: Tables with default info
    Given The table should have following column "<name>"
    Examples:
      | name        |
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |