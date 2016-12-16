@quidco-compare
Feature: As a Quidco user I want to explore compare feature for different services.

  Scenario: As a user , I want to verify How it works page content.
    Given I am on the landing page
    And I click quidco compare
    Then I should see tabs: How it works, Insurance, Broadband, Energy, FAQs
