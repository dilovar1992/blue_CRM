@smoke @US03 @logout
Feature: As a user, I should be able to logout.

  Background: User is already in the log in page
    Given the user is on the login page

  @US03AC1
  Scenario Outline: Verify user sees 5 options under the profile name.
    Given the user logged in as "<userType>"
    And user clicks profile menu
    Then user sees following profile menu options
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US03AC2
  Scenario Outline: Verify users can log out using the "Log out" button
    Given the user logged in as "<userType>"
    And user clicks profile menu
    Then user clicks on Log out button

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |