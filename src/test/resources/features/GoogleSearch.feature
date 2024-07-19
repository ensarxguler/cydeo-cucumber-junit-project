Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  #This is how we comment in .feature files
  # TODO: TO SEE THE SHORTCUT OF THE IDE USE: Alt+Enter

  Background:
    Given user is on the Google page

  Scenario: Search page default title verification
    Then user should see title is Google

  @google_search @apple
  Scenario: Google search testing
    # Given user is on the Google page
    When user searches for apple
    Then user should see apple in the title
    # And user sees 3 apples