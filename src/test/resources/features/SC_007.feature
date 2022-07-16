#SC7- Follow us
@smoke
Feature: Follow us

  Scenario Outline: User want to open NopCommerce Facebook
    When User clicks on <siteName> link
    Then <URL> is opened in new tab
    Examples:
      | siteName | URL                                                   |
      | facebook | https://www.facebook.com/nopCommerce                  |
      | twitter  | https://twitter.com/nopCommerce                       |
      | rss      | https://demo.nopcommerce.com/new-online-store-is-open |
      | youtube  | https://www.youtube.com/user/nopCommerce              |
