Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Prajwal  |    12345 |
      | Test     |    12345 |
    