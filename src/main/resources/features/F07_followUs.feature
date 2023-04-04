@smoke
Feature: F07_followUs | user is redirected correctly to icons of follow us pages
  Scenario Outline: user opens our facebook page
    Given user scrolls down
    When user clicks on "<social media icon>"
    Then user is successfully on "<our social media page>"
    Examples:
    |social media icon | |our social media page|
    |     facebook     | | https://www.facebook.com/nopCommerce |
    |     twitter      | | https://twitter.com/nopCommerce |
    |        rss       | | https://demo.nopcommerce.com/new-online-store-is-open |
    |        youtube   | | https://www.youtube.com/user/nopCommerce |


