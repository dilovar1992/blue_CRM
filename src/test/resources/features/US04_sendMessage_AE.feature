@wip @US04
Feature: As a user, I should be able to send messages.

  Background: User is already in the log in page
    Given the user is on the login page

  @US04AC1
  Scenario Outline: Verify users can send simple text messages on the stream page.
    Given the user logged in as "<userType>"
    And clicks message input box
    #And enters a "All these buds will blossom, and in that moment you will know what your grief was" message
    And clicks submit button
    Then user sees post on top of the feed

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US04AC2
  Scenario Outline: Verify users can cancel sending a message by clicking the Cancel button.
    Given the user logged in as "<userType>"
    And clicks message input box
    #And enters a "This place has only three exits, sir: Madness, and Death." message
    And clicks cancel button
    Then user should see message area collapse

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |