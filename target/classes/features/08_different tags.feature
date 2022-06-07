@testo
Feature: F08_Logged user could select different tags


  Scenario: SC8- Logged user could select different tags
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    And user select Apparel category
    And user select Shoes sub_Category
    Then user select awesome tag

