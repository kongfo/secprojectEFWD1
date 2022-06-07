@testo
Feature: Logged User could switch between currencies US-Euro


  Scenario: SC5- Logged User could switch between currencies US-Euro
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user clicks on Currency Selector
    Then user select Euro


