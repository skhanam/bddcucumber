@regression @login-logout @php7
Feature: Login Logout

  Background:  User goes to the sign in page.
    Given I am on the landing page
    When  I click on the signin link


  Scenario: As an existing premium user
    Given I am an existing premium user
    When I enter valid credentials
    And I click signIn
    Then I am logged in
    And I click signOut
    And I am logged out


  Scenario: As an existing user
    Given I am an existing normal user
    When I enter valid credentials
    And I click signIn
    Then I am logged in
    And I click signOut
    And I am logged out

  Scenario:
    Given I am an existing facebook user
    And I click sign in with facebook
    When I enter facebook valid credentials
    And I click login for facebook
    Then I am logged in
    And I click signOut
    And I am logged out

#  Scenario:
#    Given I am an existing paypal user
#    And I click sign in with paypal
#    When I enter paypal valid credentials
#    And I click login for paypal
#    Then I am logged in
#    And I click signOut
#    And I am logged out



