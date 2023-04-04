@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario:  user could login with valid email and password
    Given  user go to login page
    When user enters valid email and password
    Then user clicks login button
    Then user login is successful

    Scenario:  user could login with invalid email and password
      Given user go to login page
      When user enters invalid data
      Then user clicks login button
      Then user login is unsuccessful
