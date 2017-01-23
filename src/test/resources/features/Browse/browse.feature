@regression @browse
Feature: As a visitor , I would like to browse through different categories available on quidco.
  The user is not logged in to for this feature.
  Background:  As a user I want to go to the compare page.
    Given I am on the landing page

  Scenario Outline: As a user , I want to browse through all the categories
    When I click category <category>
    Then I should see correct label on the page
    And I should see some retailers listed
    Examples:
    |category|
    |Entertainment|
    |Fashion      |
    |Electricals  |
    |Insurance & Finance|
    |Utilities          |
    |Department Stores  |
    |Home & DIY         |
    |Toys & Gifts       |
    |Health & Beauty    |
    |Parent & Kids      |
    |Sports & Fitness   |
    |Office & Business  |
    |Auction & Selling  |
    |Pets               |
    |Cars               |
    |Charity            |
    |Food & Drink       |
    |Luxury             |
    |Telecoms           |
    |Cycling            |
