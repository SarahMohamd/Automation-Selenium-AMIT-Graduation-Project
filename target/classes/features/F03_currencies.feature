@smoke
Feature: P03_currencies | user could choose the Euro currency to use on their account
  Scenario: user could choose Euro currency and see it on his account
    Given user chooses Euro from dropdown list
    When user can see € on four products on home page