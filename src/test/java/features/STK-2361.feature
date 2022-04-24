Feature: Exchange list and exchange connect process

  #tagged name of test case in notion.so commented before scenario

  @smoke
  #[STK-2361] Exchange list and exchange connect process
    #https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see coinbase card to connect to from dashboard
    Given New User is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Coinbase card

  @smoke
  #[STK-2361] Exchange list and exchange connect process
  #https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see FTX card to connect to from dashboard
    Given New User is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the FTX card

  @smoke
    ##[STK-2361] Exchange list and exchange connect process
  #https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see FTX US card to connect to from dashboard
    Given New user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the FTX US card

  @smoke
    #[STK-2361] Exchange list and exchange connect process
#https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see Binance card to connect to from dashboard
    Given New user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Binance card

  @smoke
    #[STK-2361] Exchange list and exchange connect process
#https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see Bybit card to connect to from dashboard
    Given New user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Bybit card

  @smoke
    #[STK-2361] Exchange list and exchange connect process
#https://www.notion.so/stackedinvest/6ff63fdb0dda4f2cbdf6fabd3569d7d9?v=d32862499cd14d7a830789f8c8725957
  Scenario: New user should be able to see KuCoin card to connect to from dashboard
    Given New user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the KuCoin card