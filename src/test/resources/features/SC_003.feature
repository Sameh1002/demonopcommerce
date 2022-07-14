#SC3- Logged User could switch between currencies US-Euro
@smoke
Feature: Change currency

  Scenario: User can switch between US and Euro
    When User selects Euro from dropdown list
    Then Prices are changed from US Dollar to Euro