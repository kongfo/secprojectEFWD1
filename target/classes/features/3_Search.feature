@testo
Feature: Logged User could search for any product


  Scenario: SC4- Logged User could search for any product
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user clicks on search field
    And user search with name of product
    Then user could find relative results



  Scenario: SC5- Logged User could switch between currencies US-Euro
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user clicks on Currency Selector
    Then user select Euro



  Scenario: SC6- Logged user could select different Categories
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    Then user select Shoes sub_Category


  Scenario: SC7- Logged user could filter with color
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    And user select Shoes sub_Category
    Then user could filter with color Red

  Scenario: SC8- Logged user could select different tags
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    And user select Shoes sub_Category
    Then user select awesome tag

