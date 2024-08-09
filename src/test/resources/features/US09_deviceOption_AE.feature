@smoke @US09
Feature: As a user, I should be able to see different device option to download the different applications.

  Background: User is already in the log in page
    Given the user is on the login page

  @US09AC1
  Scenario Outline: Verify the users can get task summary on the homepage.
    Given the user logged in as "<userType>"
    And user scrolls down to see "DESKTOP CLIENT" widget
    Then user sees following device options
      | MAC OS  |
      | WINDOWS |
      | LINUX   |

    Examples:
      | userType |
      | hr       |
      | help desk         |
      | marketing manager |

  @US09AC2
  Scenario Outline: Verify users can select 2 mobile versions to download the mobile app.
    Given the user logged in as "<userType>"
    And user scrolls down to see "MOBILE APPLICATION" widget
    And user sees following mobile app stores
      | APP STORE   |
      | GOOGLE PLAY |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US09AC3
  Scenario Outline: Verify users can select 3 desktop versions to download the desktop app.
    Given the user logged in as "<userType>"
    And user sees MY TASKS widget
    Then user sees following task options
      | Ongoing   |
      | Assisting |
      | Set by me |
      | Following |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |
