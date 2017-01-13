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

      Scenario: Buy a Product
        When I search for "fitbit"
        Then I should see 3 search results for the product
        When I click buy now for first product displayed
        Then Product description is displayed
        When I click buy now
        And I enter the mandatory shipping & payment details
        And I click review order
        And I Submit order
        Then my checkout is successfull






