Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  Background:
    Given user is on the Bing page

  @bing_search @orange
  Scenario: Search result title verification
    When user enters orange in the Bing search box
    Then user should see orange in the title

  @bing_search
  Scenario: Search result title verification
    #You can use single quotation or double quotation marks to parameterize the text of String.
    When user enters 'strawberry' in the Bing search box
    Then user should see "strawberry - Search" in the title