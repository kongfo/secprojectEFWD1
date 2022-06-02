@testo
Feature: User could log in with valid email and password and reset his/her password

  Scenario: SC2- User could log in with valid email and password
    Given user go to login page
    When user login with "valid" "test2@teml.net" and "P@ssw0rd1"
    And user press on login button
    Then user login to the system successfully and go to home page


  Scenario: SC3- User could reset his/her password successfully
    Given user go to login page
    When user press on Forget password
    And user Write email
    And user press on on Recover button
    Then User could reset his_her password successfully