@postcode

  Feature: As a logged in user,  i should find nearby retailer by postcode

     Background: Logging as a premium user and go to High street

        Given I am logged in premium user

          Scenario: search retailers by postcode has retailers

            When I click on high street option on header
            And I should navigate to highstreet
            And I click on Find near by offers option
            And I enter postcode as Ig1
            And I click on find offers button
            Then I should see list of retailers

