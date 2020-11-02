@login
Feature: Users should be able to login

  Scenario Outline: verify both students and librarians login
    When user login as a <role>
    Then user should be on <page>

    Examples: | role      | page      |
              | student58 | book      |
              | librarian | dashboard |