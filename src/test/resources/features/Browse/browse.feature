@regression @browse @clout
Feature: As a visitor , I would like to browse through different categories available on quidco.
  The user is not logged in to for this feature.

  Background:  As a user I want to go to the compare page.
    Given I am on the landing page

  Scenario: As a user , I want to browse through all the categories
    When I click on Show more
    Then I should see drop down of categories
    And I should see some retailers listed
