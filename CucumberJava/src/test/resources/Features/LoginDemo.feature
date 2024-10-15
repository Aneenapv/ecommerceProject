Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
  #Scenario: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    #When user enters valid username and password
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username              | password      |
      | centanvin68@gmail.com | Password@1234 |
      | annu@gmail.com        | Password      |
