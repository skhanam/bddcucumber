@logged-in-qc
Feature: As a Quidco logged in  user I want to explore compare feature for different services.

  Background:  As a user I want to go to the compare page.
    Given I am logged in premium user
    When I click quidco compare

  Scenario: As a user, I want to see list of broadband options
    And I click Broadband tab
    When I Get a quote for Home broadband
    Then I should see list of broadband options

  Scenario: As a user , I want to see if different energy options are available for comparison
    And I click Energy tab
    Then I can see the following grid comparison options:
      | Electricity |
      | Gas         |
      | Duel Fuel   |

  Scenario Outline: As a user , I want to go to How it works page and i should be able to find the relevant content.
    And I click <TabName> tab
    Then I should see relevant content on the page
    Examples:
      | TabName      |
      | How it works |

  @QA-277,@QA-278,@QA-279
  Scenario: As a logged in user, I want to see different icons available for respective product category under how it works tab
    And I click How it works tab
    And I click Insurance icon
    Then I can see appropriate category options available
    And I click Energy icon
    Then I can see appropriate category options available
    And I click Broadband icon
    Then I can see appropriate category options available