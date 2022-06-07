@testo
Feature: Logged user could add different products to compare list


  Scenario: SC11- Logged user could add different products to compare list
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user go to product page
    And user add product to compare list
    Then The product has been added to your compare list





