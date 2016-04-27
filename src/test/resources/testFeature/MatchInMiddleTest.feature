@QP-508
Feature: Merchant name with a match in middle


  Scenario: Logged in User searching with a Search Ampersand term match
    Given I go to "http://www.quidco.com/"
    When  I click on the login link
    And I enter my username and password

  Scenario Outline:
    When I enter "<SearchTerm>" the rest url
    Then I should get back a list of merchants that contain my searchterm in the middle

    Examples:
      | SearchTerm |
      | do         |
      | cover      |
      | world      |
      | store      |
      | room       |