@regression @checkout
Feature: As a logged in user , i can checkout the product successfully without any issues.

  Background: Logging as a premium user and go to account summary  page.
    Given I am logged in premium user

  Scenario: Buy a Product
    When I search for "fitbit"
    And I click buy now for first product displayed
    When I click buy now on product description page
    And I enter the mandatory shipping & payment details
    And I click review order
#    And I Submit order
#    Then my checkout is successfull
