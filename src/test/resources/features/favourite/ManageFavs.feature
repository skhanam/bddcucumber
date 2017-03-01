@regression @manage-favs
Feature: As a logged in user , I can add & remove any retailer as favourites.

  This feature represents if the user is able to add or remove any merchant as favourites.

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user
    And There are no existing favourite retailers

  Scenario: Add a retailer to a favourite list
    When I search for "Argos"
#    Then I should see it as top retailer
#    When I click the retailer on search results page
#    And I add retailer to favourite
#    Then I should see this retailer added under bookmarks
