@e2e
Feature: Medunna Room Creation

  Background: Sign In Medunna
    Given User visits "https://medunna.com"
    When  clicks on user icon
    And   clicks on sign in option
    And   enters username into username field
    And   enters password into password field
    And   clicks on Sign In submit button

  Scenario Outline: Create Room
    When Clicks on items&titles button
    And Selects Room option
    And Clicks create new room button
    And Enters "<room number>" to Room Number field
    And Select suite option from Room Type dropdown
    And clicks on Status checbox
    And Enter "<price>" into Price field
    And Enter "<description>" into Decription input field
    And Click on Save button
    And Close the Application

    Examples:
      | room number | price | description                 |
      | 72244940    | 123   | Created for End to End Test |