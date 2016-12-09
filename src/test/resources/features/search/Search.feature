@search
Feature: As a logged in user , i can search different retailers on quidco.com

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

    Scenario: Search Retailers
      When I search for "Mark & Spencer"
      Then I should see list of retailers and similar retailers
      When I search for "Mark & Spencer"
      Then I should see list of retailers and similar retailers
