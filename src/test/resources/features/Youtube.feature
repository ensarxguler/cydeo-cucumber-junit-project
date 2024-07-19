@youTube
Feature: Youtube search functionality
  Agile Storry: User should be able to type any keyword and see relevant information

  Background:
    Given User is on the YouTube home page
    Then User sees title is as expected
    # expectedTitle: YouTube

  Scenario: Youtube title verification
    # All covered in the "Background" section already.

  Scenario: Youtube Search Functionality Title Verification (without parameterization)
    When User types Chicken in The Corn in the search box
    And User clicks to YouTube search button
    Then User sees Chicken in The Corn is in the title

  Scenario: Youtube Search Functionality Title Verification (with parameterization)
    When User types "Made in Romania" in the search box
    And User clicks to YouTube search button
    Then User sees "Made in Romania - YouTube" is in the title