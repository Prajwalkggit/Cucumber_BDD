Feature: To check login function in test demo project

  Scenario Outline: To check login function
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to the home page of test project demo

    Examples: 
      | username | password |
      | Prajwal  |    12345 |
      | Testing  |    12345 |
      | Test     |    12345 |
