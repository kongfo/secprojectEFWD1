@testo
Feature: Logged User could search for any product


  Scenario: SC4- Logged User could search for any product
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user clicks on search field
    And user search with name of product
    Then user could find relative results



