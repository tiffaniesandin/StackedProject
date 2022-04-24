@wip
Feature: Users should receive valid results when logging in

  Scenario: New User with valid credentials should be able to login and log out
    Given New User is logged in
    Then New User logs out

  Scenario:Exchange Connected User with valid credentials should be able to login and log out
    Given Exchange Connected User is logged in
    Then Exchange Connected User logs out