@regression @search
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


    Scenario: list of products displayed
      When I search for "fitbit"
      Then I should see 3 search results for the product








