@testo
Feature: F02_User could log in with valid email and password

  Scenario: SC2- User could log in with valid email and password
    Given user go to login page
    When user login with "valid" "test1@teml.net" and "P@ssw0rd1"
    And user press on login button
    Then user login to the system successfully and go to home page


