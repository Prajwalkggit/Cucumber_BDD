Feature: To test project demo

  Scenario: Check login function for project demo website
    Given user entered project demo link
    When user enters valid username and password
    And click on login button
    Then user is navigated to project demo home screen
