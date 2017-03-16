@regression @logged-in-qc @php7
Feature: As a Quidco Member user, I want to explore compare feature for different services like Insurance, Broadband, Energy.

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
      | Dual Fuel   |

  Scenario Outline: As a user , I want to go to How it works page and i should be able to find the relevant content.
    And I click <TabName> tab
    Then I should see relevant content on the page
    Examples:
      | TabName      |
      | How it works |


  Scenario: As a logged in user, I want to see different icons available for respective product category under how it works tab
    And I click How it works tab
    And I click Insurance icon
    Then I can see appropriate category options available
    And I click Energy icon
    Then I can see appropriate category options available
    And I click Broadband icon
    Then I can see appropriate category options available


  Scenario: As a  logged in user, I navigate to how it works tab and click on broadband, i can get quotes from differnt broadband providers
  and I should be landing on the appropriate product page to see the quotes.
    And I click How it works tab
    And I click Broadband icon
    And I click Home Broadband icon
    Then I should see list of broadband options
    When I click How it works tab
    And I click Broadband icon
    And I click Mobile Broadband icon
    Then I should see list of broadband options
    When I click How it works tab
    And I click Broadband icon
    And I click Office Broadband icon
    Then I should see list of broadband options


