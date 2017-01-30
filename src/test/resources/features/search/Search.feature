@regression @search
Feature: As a logged in user , i can search different retailers on quidco.com

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

    Scenario Outline: Search Retailers
      When I search for "<RetailerName>"
      Then I should see it as top retailer
      And I should also see Similar retailers to the retailer
      And I click close search
      Examples:
      |RetailerName|
      |Marks & Spencer|
      |Argos          |
      |Debenhams      |
      |John Lewis     |

    Scenario: list of products displayed and view more
      When I search for "fitbit"
      Then I should see 3 search results for the product
      When I click view more products
      Then I should see 6 search results for the product
