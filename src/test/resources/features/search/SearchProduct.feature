@regression @search-product
Feature: As a logged in user , i can search different products using Quidco Search.

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

  Scenario: list of products displayed and view more
    When I search for "fitbit"
    Then I should see 3 search results for the product
    When I click view more products
    Then I should see 6 search results for the product