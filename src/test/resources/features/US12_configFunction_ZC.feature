
Feature: Users should be able to configure the menu

  Background: User is already in the log in page
    Given the user is on the login page

  @US012AC1
  Scenario Outline: Verify users can access to 6 options under CONFIGURE MENU
    Given the user logged in as "<userType>"
    When the user clicks on CONFIGURE MENU
    Then the user can see following 6 options
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US012AC2 @wip
  Scenario Outline: Verify each option is clickable
    Given the user logged in as "<userType>"
    When the user clicks on CONFIGURE MENU
    Then the user can click following 6 options
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |