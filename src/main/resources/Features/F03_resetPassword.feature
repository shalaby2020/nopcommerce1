@regression
Feature:Reset
  Scenario: User could reset his/her password successfully
    Given go to the homepage
    When click login Link text
    And click Forgot password link text
    And enter user email
    And click recover button
    Then recovery page