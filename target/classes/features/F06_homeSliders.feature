@smoke
Feature: F06_homeSliders | user can click om home sliders in home page
  Scenario: user opens the first home slider
    Given user clicks on the home slider
    Then user is redirected to the home page

    Scenario: user opens the second slider
      Given user clicks on second home slider
      Then user is on the home page


