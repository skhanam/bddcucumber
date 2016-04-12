@smoke
Feature: search

Scenario: login with valid details
Given I go to "http://www.quidco.com/"
When  I click on the login button
And I enter my username and password
Then I should be logged in

Scenario: payment page
And I click on the payment link
Then  I should be on the payments page
