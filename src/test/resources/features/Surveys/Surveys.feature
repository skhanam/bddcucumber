#Logged in user can update the profile for surveys.

@surveys
Feature: As a Quidco Visitor user,  I want to explore compare feature for different services  like Insurance, Broadband, Energy
  The user is not logged in to for this feature.

  Scenario: Update user profile for surveys.
    Given I am logged in normal user
    When I click quidco opinions
    And I click profile button
    And I fill the form to complete my profile
