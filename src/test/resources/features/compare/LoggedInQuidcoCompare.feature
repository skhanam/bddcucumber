@logged-in-qc
Feature: As a Quidco logged in  user I want to explore compare feature for different services.

  Background:  As a user I want to go to the compare page.
    Given I am logged in premium user
    When I click quidco compare

  Scenario: As a user, I want to see list of broadband options
    And I click Broadband tab
    When I Get a quote for Home broadband
    Then I should see list of broadband options

  Scenario: As a user , I want to see if different energy options are available for comparison
    And I click Energy tab
    Then I can see the following grid comparison options:
      | Electricity     |
      | Gas |
      | Duel Fuel   |
