Feature: As a student, i should able to search books with different categories

  Scenario Outline: search books in different categories
    Given the user is on the login page
    When the user logs as a "<user>" with "<password>"
    Then The user should able to search books with "Categories"
      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective |
      | Drama |
      | Fable |
      | Fairy Tale |
      | Fan-Fiction |
      | Fantasy |
      | Historical Fiction |
      | Horror|
      | Science Fiction |
      | Biography/Autobiography |
      | Humor |
      | Romance |
      | Short Story |
      | Essay |
      | Memoir|
      | Poetry|



    Examples:
      | user                | password |
      | student58@library   | o3imcY1J |
      | student59@library   | MMxtSJFr |
      | student60@library   | G7IFdJ11 |
