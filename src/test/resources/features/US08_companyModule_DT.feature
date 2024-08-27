Feature: modules on "Company" page on the HR account
  User Story: As a user, I should be able to access to the Company page on the HR account

  Scenario Outline: User should be able to see the 7 modules on the “Company” page.
    Given the user logged in as "<userType>"
    When user click on Company link under the Activity Stream menu
    Then user should be able to see  below modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |

    Examples:

      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |
