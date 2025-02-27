@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on the homepage

  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    And  user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @boundary-login
  Scenario: Test Login with boundary values
    Given user is on login page
    When user input username "<username>" and password "<password>"
    And user click login button
    Then user able to see "<expectedResult>"

    Examples:
      | username          | password          | expectedResult             |
      | standard_user     | secret_sauce      | Login successful           |
      |                   | secret_sauce      | Epic sadface: Username is required       |
      | standard_user     |                   | Epic sadface: Password is required       |
      | user1             | pass123           | Epic sadface: Username and password do not match any user in this service  |
      | longusername1234  | longpassword1234  | Epic sadface: Username and password do not match any user in this service  |
