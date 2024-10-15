Feature: Login funtionality test

  Scenario: check login with valid credentials
    Given user is on login page
    When user enters valid email id and valid password
    And user clicks on login button
    Then user navigated to home page

  Scenario: check logout funtionality
    Given user is on home page
    When user clicks on logout button
    Then user navigated back to login page
