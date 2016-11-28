@signup-validation
Feature: User with invalid credentials cannot login

  Background:  User goes to the sign in page.
    Given I am on the landing page
    When  I click on the signin link

  Scenario Outline: user with invalid credentials cannot login

    Given I am an existing premium user
    When I enter invalid credentials as "<username>" and "<password>"
    And I click signIn
    And I see wrong credentials message

    Examples:
    |username|password|
    |quidco.tester@gmail.com|wrongpassword|
    |wrongemail@email.com|quidcotester@01|

