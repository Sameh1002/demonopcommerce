##SC1- User could register with valid data
@smoke
Feature: User registration

  Scenario: User register with a valid email and password
    Given User navigates the registration page
    When User select gender
    And User enter first name "Paul"
    And User enter last name "Smith"
    And user select day of birth "20"
    And user select month of birth "October"
    And user select year of birth "1999"
    And User enter a valid email address "8@example.org"
    And User enter a valid password "P@ssw0rd"
    And User confirm the password "P@ssw0rd"
    And User click the REGISTER button
    Then User creates a new account