@testo
Feature: user could Create successful Order

  Scenario: SC12- Create successful Order
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to shopping cart
    Then user go to shopping cart
    And user agree with the terms
    And user click checkout button
    And user fill address data with "valid" "1"
    And user click continue button
    Then user Create successful Order





