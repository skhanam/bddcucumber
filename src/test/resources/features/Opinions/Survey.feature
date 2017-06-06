@survey @regression

  Feature: As a logged in user,i can update profile if no survey available

     Background: Logging as a premium user and go to account summary  page.
          Given I am logged in premium user

          Scenario: Update survey profile

                When I click on Opinions option on header
                Then I should navigate to Survey page
                And I click on update profile option
                And I navigate to update profile page