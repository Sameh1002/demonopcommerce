##SC5-Hover Categories

@smoke
Feature: Hover Categories

  Scenario: User hovers over categories
    When User select a random category from "Computers", "Electronics", "Apparel"
    And User select a random sub-category from one of the categories and clicks on it
    Then The sub-category title should match the chosen sub-category

