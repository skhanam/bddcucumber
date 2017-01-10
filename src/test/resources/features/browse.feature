@browse-categories
Feature: As a Quidco user I want to explore compare feature for different services.
  The user is not logged in to for this feature.
  Background:  As a user I want to go to the compare page.
    Given I am on the landing page

  Scenario: As a user , I want to go to relevant category.
    When I click category "Entertainment"
    Then I should be on the correct page
    And I should see category specific retailers listed



