@signup
Feature: Signup

  Background: User goes to the sign in page.
    Given I am on the landing page

  Scenario: As a new user
    When  I click on the signin link
    Given I am a new normal user
    And I click join for free
    When I enter all the mandatory fields and sign up
    Then I am logged in

  Scenario: As a new premium user
    When  I click on the signin link
    Given I am a new premium user
    And I click join for free
    When I enter all the mandatory fields and sign up
    Then I am logged in

  Scenario: As a user I can Signup from Join now button
    Given I am a new premium user
    When I click Join Quidco now
    And I enter all the mandatory fields and sign up
    Then I am logged in
