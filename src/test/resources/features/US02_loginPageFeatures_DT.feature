@smoke @US02
Feature: login page features.
  User Story:As a user, I should be able to access login page features.
Background:
  Given the user is on the login page
  @US02AC1
  Scenario: checkbox on the login page
    When the user should be able to see "Remember me on this computer"
    Then the user should be able to check the checkbox

  @US02AC2
  Scenario: Forgot password link
    When user clicks on "FORGOT YOUR PASSWORD?" link
    Then user should be able to go to "Get Password" page

