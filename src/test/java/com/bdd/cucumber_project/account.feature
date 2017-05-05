Feature: User account

  Scenario: Not logged in user should not be able to reach his account
    Given I am on landing page
    When I go to "http://courses.ultimateqa.com/account"
    Then I should be informed I need to log in
    And I close the browser
