@regression
Feature: Register
  Scenario: guest user could register with valid data successfully
    When navigate to homepage
    And click register button
    And fill data and submit
    Then Registration page

