#SC8- Wishlist
@smoke
Feature: Wishlist


  Scenario: Item Added to wishlist
    Given User add an item to wishlist by clicking the heart symbol
    Then The message "The product has been added to your wishlist" appears, with background color "rgba(75, 176, 122, 1)"

  Scenario: Check the wishlist
    Given User add an item to wishlist by clicking the heart symbol
    When User waits after adding the item to his wishlist
    And User navigates to his wishlist
    Then The quantity value is bigger than 0
