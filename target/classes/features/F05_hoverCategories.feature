@smoke
Feature: F05_hoverCategories | user an hover on main category and select sub-category
  Scenario: user hovers on Computers and selects Desktops
    Given user hovers on computers
    When user selects Desktops sub-category
    Then user gets the desktops page
