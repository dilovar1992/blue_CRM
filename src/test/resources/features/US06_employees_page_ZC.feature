Feature: Users should be able to access to the Employees page

  Background: User is already in the log in page
    Given the user is on the login page

  @US06AC1
  Scenario Outline: Verify users see the 8 modules in the Employees page shown as design
    Given the user logged in as "<userType>"
#    Given the user logged in with username as "User1" and password as "UserUser123"
    When users click on the Employees page
    Then users see following 8 modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |


    Scenario Outline: Verify users can add department on the Employees page.
      Given the user logged in as "<userType>"
      When the user clicks on Add Department button
      Then the user can add department
      And the user can see the department in the company structure system
      Examples:
        | userType          |
        | hr                |
        | help desk         |
        | marketing manager |