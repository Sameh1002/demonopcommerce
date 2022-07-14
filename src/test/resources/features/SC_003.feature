#SC3- Logged User could switch between currencies US-Euro
@smoke
Feature: Change currency

  Scenario: User can switch between US and Euro
    When User selects currency "Euro" from dropdown list
    Then Prices changes with symbol "€"