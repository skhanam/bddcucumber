@regression @quidco-compare @clout
Feature: As a Quidco Visitor user,  I want to explore compare feature for different services  like Insurance, Broadband, Energy
  The user is not logged in to for this feature.

  Background:  As a user I want to go to the compare page.
    Given I am on the landing page
    When I click quidco compare

  Scenario: As a user , I want to verify different tabs on quidco compare page.
    Then I should see tabs: How it works, Insurance, Broadband, Energy, FAQs

  Scenario Outline: As a user , I want to go to How it works page and i should be able to find the relevant content.
    And I click <TabName> tab
    Then I should see relevant content on the page
    Examples:
      | TabName      |
      | How it works |

#  Scenario: As a user, I want to navigate all FAQ related topics
#    And I click FAQs tab
#    Then I should see 7 FAQs
#    And I can see relevant information about each FAQ

  Scenario:  As a user, I want to see different options for Insurance under Compare.
    And I click Insurance tab
    Then I can see the following grid comparison options:
      | Car insurance        |
      | Home insurance       |
      | Travel insurance     |
      | Van insurance        |
      | Motorcycle insurance |
      | Pet insurance        |

  Scenario: As a user , I want to see if different broadband options are available for comparison
    And I click Broadband tab
    Then I can see the following grid comparison options:
      | Home broadband     |
      | Business broadband |
      | Mobile broadband   |



