@Goals @Web
Feature: Goals

  @Test-209090
  Scenario:Verify that when a new user is onboarded goal account balance is $0
    Given User launches the website
    And Logs into the website with new account
    Then Verify user lands on Dashboard
    And Goals balance is visible on the Dashboard
    When User clicks on the Goals tile
    Then Verify Goals balance is "$0.00"
    And "Your goal account is empty" heading is displayed
    And The Add funds message is visible

  Scenario: Verify that user is able to transfer amount to Goal Account that is not greater than the Main Account balance
    Given User launches the website
    And Logs into the website
    Then Verify user lands on Dashboard
    And Goals balance is visible on the Dashboard
    When User clicks on the Goals tile
    And Clicks on Add Funds button
    Then Verify Transfer Money popup is visible
    And Cross icon is visible
    And From drop-down is visible inside Transfer Money
    And To drop-down is visible inside Transfer Money

    When User selects Main Account in From drop-down
    Then Verify User is able to select Goal Account in To drop-down only
    And Transfer Now button is disabled

    When User enters amount greater than Main Account balance
    Then Verify Transfer Money is enabled
    When User clicks on Transfer Money button
    Then Verify insufficient balance message is shown
    When User click on Cross icon
    Then Verify user lands on Goals page

    When User selects Main and Goals account for respective dropdowns
    And Enters amount equals or less than the main balance
    Then Verify Transfer Money button is enabled
    When User clicks on Transfer Money button
    Then Verify Transaction success popup is visible
    And Verify details of popup
    When User clicks on cross icon
    Then Verify user lands on goals page

    When User revert back the transactions