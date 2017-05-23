@regression @manage-favs
Feature: As a logged in user , I can manage favourites.

  This feature represents if the user is able to go to manage favourites bookmarks and can see all retailers

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user
    And There are no existing favourite retailers

  Scenario: Add a retailer to a favourite list
    When I search for "Expedia"
    Then I should see it as top retailer
    When I click the retailer on search results page
    And I add retailer to favourite
    When I search for "Debenhams"
    Then I should see it as top retailer
    When I click the retailer on search results page
    And I add retailer to favourite
    When I am on favourite icon
    And I click Manage Favourites option under menu
    Then I should see below merchants added under favourites
      | Expedia     |
      | Debenhams   |

