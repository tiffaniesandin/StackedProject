## These coins are changing daily. Therefore I'm not sure if we want to put in the time to get this test to pass everyday or not
Feature: STK-2362/2422 Alerts page - main tab (stacks)

  #tagged name of test case in notion.so commented before scenario

  Background:
    Given  New User is logged in

  @STK-2362/2422 @progression
  #[STK-2362/2422] Empty state - Trending coins area (Top tab)
  #https://www.notion.so/stackedinvest/ad0ca93bc80f4f3fa19b23096da7d17e?v=63d5c0c5b32d4fdaafd55ee9269dc017
  Scenario: As a new user on Stacked who does not have any exchange assets, I would like to see some information about trending coins on the Dashboard page.
    Then Click on the Top tab
    And Hover over on the coin is not enabled for purchasing with Gem
    Then Hover over on the Buy XXX button
    Then Click on the Learn more text
    Then Click the Dashboard link
    Then Click on the Top tab
    Then Click the See more link