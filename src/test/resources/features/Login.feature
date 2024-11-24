Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters a valid username and password
    And clicks the login button
    Then the user should be redirected to the home page
    And see a welcome message

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters an invalid username and/or password
    And clicks the login button
    Then the user should see an error message
    And remain on the login page

  Scenario: Unsuccessful login with empty fields
    Given the user is on the login page
    When the user leaves the username and password fields empty
    And clicks the login button
    Then the user should see a validation message
    And remain on the login page
