@testo
Feature: user could add different products to Shopping cart, Wishlist , compare list and create order

  Scenario: SC9- Logged user could add different products to Shopping cart
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to shopping cart
    Then The product has been added to your cart

  Scenario: SC10- Logged user could add different products to Wishlist
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to Wishlist
    Then The product has been added to your Wishlist


  Scenario: SC11- Logged user could add different products to compare list
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to compare list
    Then The product has been added to your compare list

  Scenario: SC12- Create successful Order
    Given user go to login page
    When user login with "valid" "test4@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to shopping cart
    Then user go to shopping cart
    And user agree with the terms
    And user click checkout button
    And user fill address data with "valid" "1"
    And user click continue button
    Then user Create successful Order





