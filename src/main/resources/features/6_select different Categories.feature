@testo
Feature: Logged user could select different Categories

  Scenario: SC6- Logged user could select different Categories
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    Then user select Shoes sub_Category


