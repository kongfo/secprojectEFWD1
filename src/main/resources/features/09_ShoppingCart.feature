@testo
Feature: F09_Logged user could add different products to Shopping cart

  Scenario: SC9- Logged user could add different products to Shopping cart
    Given user go to login page
    When user login with "valid" "test1@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to shopping cart
    Then The product has been added to your cart


