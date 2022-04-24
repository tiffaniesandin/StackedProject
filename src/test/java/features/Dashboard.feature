
Feature: Stacked Invest Dashboard

    #tagged name of test case in notion.so commented before scenario

  Background:
    Given Exchange Connected User is logged in

      #still in progress
  Scenario: A user with no exchange configured will connect to an exchange
    When a user is on the exchange page
    And if the Safety First pop up displays then the user clicks the Remind me later button
    And a user clicks add exchange
    Then exchanges "AAX", "AscendEX Futures", "Binance", "Binance Futures", "Bitfinex","BitMEX", "ByBit", "Coinbase", "FTX", "FTX US", "KuCoin", "Phemex" are displayed

