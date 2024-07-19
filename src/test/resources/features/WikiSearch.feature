@wiki
Feature: Wikipedia Search Functionality Verifications

  Background:
    Given User is on Wikipedia home page

  @wikiTitle
  Scenario: Wikipedia Search Functionality "Title" Verification
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the wiki title

  @wikiHeader
  Scenario: Wikipedia Search Functionality "Header" Verification
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the main header

  @wikiImageHeader
  Scenario: Wikipedia Search Functionality "Image Header" Verification
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Scenario Functionality with Scenario Outline
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie        | Marie Curie         |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
    