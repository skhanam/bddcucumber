@login-logout
Feature: User is able to login to the quido app.

  Background:  User goes to the sign in page.
    Given I am on the landing page
    When  I click on the signin link


  Scenario: Verifying the login logout

    And I enter my username as "quidco.tester@gmail.com" and password as "quidcotester@02"
    And I click signIn
    And I am logged in
    And I click signOut
    And I am logged out

  Scenario Outline:  Verifying that user with wrong credentials is not able to login
    And I enter my username as "<Username>" and password as "<Password>"
    And I click signIn
    Then I see wrong credentials message

  Examples:
  |Username|Password|
  |wrongemail@gmail.com|quidcotester@02|
  |quidco.tester@gmail.com|wrongpassword|





