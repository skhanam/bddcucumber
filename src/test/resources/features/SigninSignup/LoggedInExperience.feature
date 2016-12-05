#@user-experience
Feature: Logged in user experience
  As a logged in user, I should see different dropdown options.
  Scenario: As a logged in user , I should see dropdown options under avatar.
    Given I am logged in premium user
    When I am on avatar
    Then I should see drop down with options:
    |Account Summary|
    |Activity|
    |Payments|
    |Refer Quidco|
    |My reviews|
    |Settings|
    |Sign out|

