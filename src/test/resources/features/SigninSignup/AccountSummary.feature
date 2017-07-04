@regression @account-summary @clout
Feature: As a logged in user on account summary

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in normal user
    And I click Account Summary dropdown option

  Scenario: As a loggedIn user on account summary page.
    Then I should see title on Account Summary Tab:
      | Payable cashback |
      | Tracked cashback |
      | Reward bonus     |
    And I should see link on Account Summary Tab:
      | Payment history        |
      | Annual summary         |
      | Activity               |
      | Missing a transaction? |
    And I should see button on Account Summary Tab:
      | Pay me |

  Scenario: As a loggedIn user on account summary page, navigating to different tabs should show the appropriate page.
    When I click on "Activity" tab on account summary page
    Then I should see "High Street" on the "Activity"
    When I click on "Payments" tab on account summary page
    Then I should see "Payments" on the "Payments"
    When I click on "Refer Quidco" tab on account summary page
    Then I should see "What do you want to refer?" on the "Refer Quidco"
    When I click on "My reviews" tab on account summary page
    Then I should see "My Reviews" on the "My reviews"
    When I click on "Settings" tab on account summary page
    Then I should see "General account settings" on the "Settings"

