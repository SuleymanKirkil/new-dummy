@e2e , @api
Feature: Api Room Creation Verification
  Scenario: Api Room
    Given User sends Get Request For last creates Rooms
    Then  User verifies that room is created
