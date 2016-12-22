@search
Feature: As a logged in user , i can search different retailers on quidco.com

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

    Scenario: Search Retailers
      When I search for "Marks & Spencer"
      Then I should see it as top retailer
      And I should also see Similar retailers to the retailer
      And I click close search
      When I search for "Argos"
      Then I should see it as top retailer
      And I should also see Similar retailers to the retailer
      And I click close search
      When I search for "Debenhams"
      Then I should see it as top retailer
      And I should also see Similar retailers to the retailer
      And I click close search
      When I search for "John Lewis"
      Then I should see it as top retailer
      And I should also see Similar retailers to the retailer
      And I click close search

      Scenario: Search Products
        When I search for "Washing Machine"
        Then I should see retailers for this product