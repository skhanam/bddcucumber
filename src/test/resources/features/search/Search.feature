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


      Scenario: Search Products
        When I search for "Washing Machine"
        Then I should see retailers for this product