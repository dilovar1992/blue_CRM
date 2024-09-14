@smoke @US11
Feature: create and cancel appreciation message
  User Story:As a user, I should be able to create an appreciation
@US11AC1
Scenario Outline: User should be able to create a simple appreciation with an appreciation message.
  Given the user logged in as "<userType>"
  When the user chooses "Appreciation" from dropdown on the main page
  And the user write the "Know, accept, and love who you are" on the text area
  And clicks submit button
  Then the user sees "Know, accept, and love who you are" on the main page

  Examples:
    | userType          |
    | hr                |
    | help desk         |
    | marketing manager |

  @US11AC2
  Scenario Outline: User should be able to cancel an appreciation
    Given the user logged in as "<userType>"
    When the user chooses "Appreciation" from dropdown on the main page
    And the user write the "turaev" on the text area
    And clicks cancel button
    Then the user sees "Send message …" below MESSAGE module

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |