#SC6- Click on sliders
@smoke
Feature: Click on silders

  Scenario Outline: User click on sliders
    When User click on <slider>
    Then Page change to product page <productPage>
    Examples:
      | slider | productPage                                   |
      | 1      | https://demo.nopcommerce.com/nokia-lumia-1020 |
      | 2      | https://demo.nopcommerce.com/iphone-6         |