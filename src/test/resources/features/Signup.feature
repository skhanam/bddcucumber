@signup
Feature: This feature is about that I am able to Signup as a new user.

  Background: User goes to the sign in page.
    Given I am on the landing page
    When  I click on the signin link

  Scenario: As a new user
    Given I am a new normal user
    And I click join now
    When I enter all the mandatory fields and sign up
    Then I am logged in

  Scenario: As a new premium user
    Given I am a new premium user
    And I click join now
    When I enter all the mandatory fields and sign up
    Then I am logged in
