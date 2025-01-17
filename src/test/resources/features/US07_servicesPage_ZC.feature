@smoke @US07
Feature: Users should be able to access to the Services page

  Background: User is already in the log in page
    Given the user is on the login page

  @US07AC1
  Scenario Outline: Verify users see the 11 modules in the Services page shown as design
    Given the user logged in as "<userType>"
    When the user clicks on Services page
    Then the user can see following 14 modules
      | Meeting Room Booking |
      | Ideas                |
      | Lists                |
      | e-Orders             |
      | Training             |
      | Wiki                 |
      | Contact Center       |
      | FAQ                  |
      | Polls                |
      | Technical Support    |
      | Link Directory       |
      | Subscription         |
      | Change Log           |
      | Classifieds          |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |

  @US07AC2
  Scenario Outline: Verify users can access to the FAQ documents.
    Given the user logged in as "<userType>"
    When the user clicks on Services page
    And the user clicks on FAQ button
    Then the user can access to the following 3 documents
      | Work Process          |
      | Files and Documents   |
      | Using portal services |

    Examples:
      | userType          |
      | hr                |
      | help desk         |
      | marketing manager |