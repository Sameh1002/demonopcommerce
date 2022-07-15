#SC4- Item search
@smoke
Feature: Searching

  Scenario Outline: User could search using product name
    When User enter product name or SKU <searchTerm>
    Then Verify URL contains "https://demo.nopcommerce.com/search?q="
    And Count number of search results
    And Verify each result contains the search term <searchTerm>
    Examples:
      | searchTerm |
      | book        |
#      | laptop      |
#      | nike   |

  Scenario Outline: User could search for product using sku
    When User enter product name or SKU <searchTerm>
    Then Go to the product page
    And Verify the product page contains the SKU <searchTerm>
    Examples:
      | searchTerm |
      | SCI_FAITH |
#      | APPLE_CAM |
#      | SF_PRO_11 |
