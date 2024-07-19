@webTableLogIn
Feature: Web table app log-in functionality
  Agile Story: User should be able to login with correct credentials

  Background:
    Given User is on the login page of Web Table app

  Scenario: Positive login scenario
    When User enters correct credentials
    #Logged in in this step using a utility method
    Then User should see URL contains orders

  Scenario: User should be able to login with correct credentials
    When User enters correct "Test" for username
    And User enters correct "Tester" for password
    Then User should see URL contains "cydeo"

  Scenario: User should be able to login with correct credentials
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see URL contains "table"
