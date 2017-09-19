@regression @QuidcoFaq @clout
Feature: As a Quidco Visitor user,  I want to explore compare feature for different services  like Insurance, Broadband, Energy
  The user is not logged in to for this feature.

  Background:  As a user I want to go to the compare page.
    Given I am on the landing page
    When I click quidco compare
    And I click  faqtab

  Scenario: As a user, I want to navigate all FAQ related topics
#    And I click FAQs tab
    Then I should see 7 FAQsPresent
    And I can see relevant information about each FAQ Page