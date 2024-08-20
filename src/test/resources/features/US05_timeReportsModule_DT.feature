@smoke @US05
Feature: Time and Reports page
  User Story:As a user, I should be able to access to the time reports.

  Background:
    Given the user is on the login page


  @US05AC1
  Scenario Outline: User should be able to see the 5 modules on the “Time and Reports” page.
    Given the user logged in as "<userType>"
    When Users click on "Time Reports" link under the "Activity Stream" menu
    Then User sees 5 modules above "Absence Chart" header
    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |
  @US05AC2
  Scenario Outline: User should be able to see 2 checkboxes on the “Worktime” module.
    Given the user logged in as "<userType>"
    When Users click on "Time Reports" link under the "Activity Stream" menu
    And Users click on "Worktime" module
    Then Users should see "Statistics" and "Show start and end times" checkboxes
    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US05AC3
  Scenario Outline: “Statistics” checkbox should be selected by default.
    Given the user logged in as "<userType>"
    When Users click on "Time Reports" link under the "Activity Stream" menu
    And Users click on "Worktime" module
    Then User sees "Statistics" checkbox is selected
    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |


