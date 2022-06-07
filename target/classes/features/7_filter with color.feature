@testo
Feature: Logged user could filter with color


  Scenario: SC7- Logged user could filter with color
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    And user select Shoes sub_Category
    Then user could filter with color Red


