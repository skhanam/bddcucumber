@browse @regression @clout
Feature: As a logged in user , I would like to browse through different categories available on quidco.


  Background: Logging as a normal user
    Given I am logged in normal user

  Scenario: As a user , I want to browse through all the categories
    When I click on Show more
    Then I should see drop down of categories
    And I should see some retailers listed
