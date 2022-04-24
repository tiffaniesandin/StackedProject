Feature: Verifying empty states for products area

  #tagged name of test case in notion.so commented before scenario

  Background:
    Given Exchange Connected User is logged in

  @STK-2363/2475 @progression #inprogress #need user on new dashboard with no bots to test
  #[STK-2367] Populated state - Bots (User is subscribed to Bot(s), but Bot(s) not yet configured)
    #https://www.notion.so/stackedinvest/b1a62bee9f954fde97ea85b9f10a0c1c?v=fec4bacc916a483ab7b9bdc298854e51
  Scenario: A user with no Bots configured will see the Bots tab as an empty state
    When a user is on the dashboard and clicks the Bots tab
    Then a user will see bots subscribed but not yet configured, bot set up cards will display
    And bot set up cards will include bot name, text "Set up your bot to start trading", and button "Set up"
    When a user clicks on the Set up button
    Then the bot set up page displays
    When a user clicks on the "View All Bots" button text
    Then a user is navigated to the Bots page and is able to view all bots available
