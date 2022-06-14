@regression
Feature: Login
  Scenario: guest user could Login with valid credentials
    Given go to homepage
    When click login tab
    And enter username and password
    And click LOGIN button
    Then login page
