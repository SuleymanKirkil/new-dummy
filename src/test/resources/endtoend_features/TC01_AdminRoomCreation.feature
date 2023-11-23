@e2e
Feature: Medunna Room Creation

  Background: Sign In Medunna
    Given User visits "https://medunna.com"
    When  clicks on user icon
    And   clicks on sign in option
    And   enters username into username field
    And   enters password into password field
    And   clicks on Sign In submit button

  Scenario: Create Room
    When Clicks on items&titles button