##SC2- User login
@smoke
Feature: User login

  Scenario: User login with a valid email and  a valid password
    When User navigates the login page
    And User enters a valid email "8@example.org"
    And User enters a valid password "P@ssw0rd"
    And User click the LOGIN button
    Then User logins successfully

  Scenario: User login with an invalid email and a password
    When User navigates the login page
    And User enters an invalid email "wrongmail@example.com"
    And User enters an invalid password "WrongPassword"
    And User click the LOGIN button
    Then User can't login

