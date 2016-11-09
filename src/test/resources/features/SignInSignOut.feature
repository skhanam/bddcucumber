@login-logout
Feature: Logged search test


  Scenario: Log in a User
    Given I am on "http://staging1.quidco.com"
    When  I click on the signin link
    And I enter my credentials
    And I click signIn
    Then I am logged in
    And I click signOut
    And I am logged out






