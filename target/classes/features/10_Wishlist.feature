@testo
Feature: F10_Logged user could add different products to Wishlist


  Scenario: SC10- Logged user could add different products to Wishlist
    Given user go to login page
    When user login with "valid" "test1@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to Wishlist
    Then The product has been added to your Wishlist


