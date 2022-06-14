@regression
Feature:switch between currencies
  Scenario: guest user could switch between currencies [$, €]
    Given homepage
    When select currency
    Then Euro Symbol is shown on products displayed in Home page
