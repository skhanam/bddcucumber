@QP-888-Fake-exact-matches
Feature: Logged search test


  Scenario: Log in a User
    Given I am on "http://delta5.quidco.com"
    When  I click on the login link
    And I enter my username and password

  Scenario Outline: User searching with a Search term
    And I enter a search term "<SearchTerm>" in the search field
    Then I should get back a merchant that matches exactly"<ExactMerchantName>" my search term
    And I click on the merchant matched


    Examples:
      | SearchTerm     | ExactMerchantName |
      | marks & spence | Mark and spencer  |
      | amaz           | Amazon            |
      | m and co       | M&CO              |
      | House of fr    | House of Fraser   |
      | bed so         | Bed SOS           |




