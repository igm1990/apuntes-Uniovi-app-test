Feature: Create learn subject

  Scenario: Create a subject with a student
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And assign teacher role
    And tries to save data
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And add a teacher
    And tries to save data
    And tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    When tries to see the list of subjects
    And open subject filter menu
    And insert name filter
    And apply filters
    And open subject details
    And show students tab
    And open students subject modal
    And add a student
    And tries to save data
    And the application will let him add it

