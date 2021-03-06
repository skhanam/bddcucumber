@regression @signup-validation @clout
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
      | username                   | password        |
      | quidco.tester | wrongpassword   |
      | wrongemail    | quidcotester@01 |

#  Scenario Outline: user with invalid facebook credentials cannot login
#
#    Given I am an existing facebook user
#    And I click sign in with facebook
#    When I enter facebook invalid credentials as "<username>" and "<password>"
#    And I click login for facebook
#    And I see wrong credentials message for facebook
#
#    Examples:
#      | username                | password      |
#      | quidco.tester@gmail.com | wrongpassword |
