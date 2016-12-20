@quidco-compare
Feature: As a Quidco user I want to explore compare feature for different services.

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



