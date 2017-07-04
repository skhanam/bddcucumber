@discover @php7
Feature: As a logged in user , i can go to discover and explore more interesting retailers.

  Background: Logging as a premium user and go to account summary  page.
    Given I am on discover page

  Scenario:
    When I click random retailer on discover page
    Then User lands on the correct page


