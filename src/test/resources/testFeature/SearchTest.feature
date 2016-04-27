@smoke
Feature: Logged in search


  Scenario: Logged in User searching with a Search Ampersand term match
    Given I go to "http://www.quidco.com/"
    When  I click on the login link
    And I enter my username and password

  Scenario Outline: Logged in User searching with a Search Ampersand term match
    And I enter a search term with an ampersand"<SearchTerm>" on the rest url
    Then I should get back a merchant that matches exactly"<ExactMerchantId>" my search term
    Then I should see merchants similar to my searchTerm
    Examples:
      | SearchTerm      | ExactMerchantId  |
      | marks & spencer | Mark and spencer |
      | b and q         | B&Q              |
      | amaz            | Amazon           |
      | m and co        | M&CO             |
      | House of fr     | House of Fraser  |
      | John le         | John Lewish      |

