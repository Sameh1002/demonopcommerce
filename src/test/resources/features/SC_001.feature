##SC1- User could register with valid data
@smoke
Feature: User registration

  Scenario: User register with a valid email and password
    Given User navigates the registration page
    When User select gender
    And User enter first name "Paul"
    And User enter last name "Smith"
    And User select date of birth
    And User enter a valid email address "6@example.org"
    And User enter a valid password "P@ssw0rd"
    And User confirm the password "P@ssw0rd"
    And User click the REGISTER button
    Then User creates a new account