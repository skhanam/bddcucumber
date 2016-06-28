@smoke-test2
Feature: Logged in search


#  Scenario: Logged in User searching with a Search Ampersand term match
#    Given I go to "http://www.quidco.com/"
#    When  I click on the login link
#    And I enter my username and password
#    Then I should be logged in

  Scenario Outline: Logged in User searching with a Search Ampersand term match
    Given I go to "http://www.quidco.com/"
    When I enter a search term with an ampersand"<SearchTerm>" on the rest url
    And I should get back a merchant that matches exactly"<ExactMerchantId>"and rate"<MerchantRateValue>"my search term
    Then I should find a merchant similar "<similarResults>" result to my searchTerm


    Examples:
      | SearchTerm      | ExactMerchantId | MerchantRateValue | similarResults  |
      | marks & spencer | Marks & Spencer | 3                 | Debenhams       |
      | b and q         | B&Q             | 8%                | Wickes          |
      | amaz            | Amazon          | 5%                | Currys          |
      | m and co        | M&CO            | 4%                | Dorothy Perkins |
      | House of fr     | House of Fraser | 7.5%              | Liberty         |
      | bed so          | Bed SOS         | 8%                | Bed Guru        |

