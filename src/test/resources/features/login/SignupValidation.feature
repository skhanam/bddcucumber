Feature: User with invalid credentials cannot login
  Scenario Outline: user with invalid credentials cannot login

    Given I am on the homepage
    And I click on the signin link
    And I enter my username as "<username>" and password as "<password>"
    And I see wrong credentials message

    Examples:
    |username|password|
    |quidco.tester@gmail.com|wrongpassword|
    |wrongemail@email.com|quidcotester@01|
    |wrongemail@email.com|quidcotester@01|
    |wrongemail@email.com|quidcoteste|

