@testo
Feature: F03_User could reset his/her password


  Scenario: SC3- User could reset his/her password successfully
    Given user go to login page
    When user press on Forget password
    And user Write email
    And user press on on Recover button
    Then User could reset his_her password successfully