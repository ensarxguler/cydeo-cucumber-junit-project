@regression @login
Feature:

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
  
  # This is how we comment in the feature files

  Background: For all scenarios user is on the login page of the library application
    Given user is on the login page of the library application

  @smoke @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @smoke @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @smoke @admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard 