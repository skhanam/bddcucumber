@QP-888-Fake-exact-matches
Feature: Logged search test


  Scenario: Log in a User
    Given I am on "http://delta2.quidco.com"
    When  I click on the login link
    And I enter my username and password

  Scenario Outline: User searching with a Search term
    And I enter a search term "<SearchTerm>" in the search field
    Then I should get back a merchant that matches exactly"<ExactMerchantId>" my search term
    And I click on the merchant matched
    Then I  should be on merchant page
    Examples:
      | SearchTerm      | ExactMerchantId  |
      | marks & spence  | Mark and spencer |
      | amaz            | Amazon           |

