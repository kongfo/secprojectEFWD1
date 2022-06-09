@testo
Feature: F14_user can opens facebook/twitter/rss/Youtube pages

  Scenario: SC15- user can opens facebook page

   When user click facebook
    Then verify that it opens facebook page



  Scenario: SC16- user can opens twitter page
    When user click twitter
    Then verify that it opens twitter page


  Scenario: SC17- user can opens rss page

    When user click rss
    And verify that it opens rss page
    Then Open Feed Validation Service3 verify that Feed is Valid



  Scenario: SC18- user can opens Youtube page

    When user click youtube
    Then verify that it opens youtube page


