@regression @add-favourite
Feature: As a logged in user , i can search different retailers / merchants using Quidco Search

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

  Scenario:  Add a retailer to a favourite one
    When I search for "Argos"
    Then I should see it as top retailer
    When I click the retailer on search results page
    And I add retailer to favourite
    Then I should see this retailer added under bookmarks



