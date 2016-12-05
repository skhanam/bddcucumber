@account-summary
Feature: As a logged in user on account summary

  Scenario: As a loggedIn user on account summary page.
    Given I am logged in premium user
    And I click Account Summary dropdown option
    Then I should see title on Account Summary Tab:
      | Payable cashback |
      | Tracked cashback |
      | Reward bonus     |
    And I should see link on Account Summary Tab:
      | Payment history |
      | Annual summary  |
      | Activity|
      | Missing a transaction? |
    And I should see button on Account Summary Tab:
      |Pay me|

