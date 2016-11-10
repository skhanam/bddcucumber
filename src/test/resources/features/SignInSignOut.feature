@login-logout
Feature: User is able to login to the quido app.

  Background:  User goes to the sign in page.
    Given I am on "http://staging1.quidco.com"
    When  I click on the signin link


  Scenario: Verifying the login logout

      Scenario Outline: Checking to see if appropriate user is able to login.
      And I enter my username as "<Username>" and password as "<Password>"
      And I click signIn
      Then I have a "<validorinvalid>" login
        And I log

      Examples:
      |Username|Password|validorinvalid|
      |quidco.tester@gmail.com|quidcotester@02|valid|
      |wrongemail@gmail.com|quidcotester@02|invalid|
      |quidco.tester@gmail.com|wrongpassword|invalid|





