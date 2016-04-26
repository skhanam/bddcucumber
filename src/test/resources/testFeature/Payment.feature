@smoke
Feature: search

  Scenario: login with valid details
    Given I go to "http://www.quidco.com/"
#When  I click on the login button
#And I enter my username and password
#Then I should be logged in
#
#
#  Scenario: payment page
#    And I click on the payment link
#    Then  I should be on the payments page

  Scenario Outline: User searching with an Exact term match

    Given I enter a "<SearchTermWithAmpersand>" on the rest url
    Then I should get back a  merchant that "<ExactMerchantId>" exactly matches the searchTerm
    Examples:
      | SearchTermWithAmpersand | ExactMerchantId  |
      | marks & spencer         | Mark and spencer |
      | b and q                 | B&Q              |
      | p and o ferries         | P&O              |
      | m and co                | M&CO             |



