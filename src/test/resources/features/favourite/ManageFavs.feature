@regression @manage-favs @clout
Feature: As a logged in user , I can manage favourites.

  This feature represents if the user is able to go to manage favourites bookmarks and can see all retailers

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user
    And There are no existing favourite retailers

  Scenario Outline: Add a retailer to a favourite list
    When I search for <merchantname>
    Then I should see it as top retailer
    When I click the retailer on search results page
    And I add retailer to favourite
    When I am on favourite icon
    And I click Manage Favourites option under menu
    Then I should see below <merchantname> added under favourites


    Examples:
    | merchantname|
    |  Expedia  |
    | Debenhams  |
