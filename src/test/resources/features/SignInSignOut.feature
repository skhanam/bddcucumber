@login-logout
Feature: An Existing user is able to login.

  Background:  User goes to the sign in page.
    Given I am on the landing page
    When  I click on the signin link


    Scenario: As an existing premium user
      Given I am an existing premium user
      When I enter valid credentials
      And I click signIn
      Then I am logged in


    Scenario: As an existing user
      Given I am an existing normal user
      When I enter valid credentials
      And I click signIn
      Then I am logged in





