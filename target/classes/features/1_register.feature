@testo

Feature: User could register with valid data

  Scenario:  SC1- User could register with valid data
    Given user go to register page
    When user register with "valid" "test" and "test" and "test4@teml.net" and "test1" and "P@ssw0rd1" and "P@ssw0rd1"
    And user press on register button
    Then user registrated to the system successfully
