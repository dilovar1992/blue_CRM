@smoke @US10
Feature: As a user, I should be able to create a poll.

  Background: User is already in the log in page
    Given the user is on the login page

  @US10AC1
  Scenario Outline: Verify users can create a simple poll with a question and 2 answers.
    Given the user logged in as "<userType>"
    When the user clicks on POLL tab
    And the user enters the following poll information
      | Title    | Java Masters              |
      | Question | Which one is your master? |
      | Answer 1 | Saim                      |
      | Answer 2 | Muhtar                    |
    And clicks submit button
    Then user sees the poll content on top of the feed

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US10AC2
  Scenario Outline: Verify users can cancel a poll.
    Given the user logged in as "<userType>"
    When the user clicks on POLL tab
    And the user enters the following poll information
      | Title    | Poll for tv show                  |
      | Question | Which one do you prefer to watch? |
      | Answer 1 | Arrow                             |
      | Answer 2 | The Flash                         |
    And clicks cancel button
    Then user should see message area collapse

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |



#    Acceptance Criteria:
#    1. Verify users can create a simple poll with a question and 2 answers. -
#    successfully created poll should be displayed in the feed.
#    2. Verify users can cancel a poll.
#    - Poll message area should collapse after clicking the Cancel button.