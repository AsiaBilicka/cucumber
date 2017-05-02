Feature: Login

  Scenario: User should be able to login with proper credentials
    Given I am on login site
    When I click on "Sign In"
    And I enter data
      | Fields   | Value       |
      | email    | email@to.me |
      | password | password    |
    And I click the login button
    Then I check the url
    And I close the browser

  Scenario: User should not be able to login with wrong credentials
    Given I am on login site
    When I click on "Sign In"
    And I enter data
      | Fields   | Value            |
      | email    | wrong-mail@to.me |
      | password | password         |
    And I click the login button
    Then I should get warning
    And I close the browser

  Scenario: User should be informed if he has used wrong email format
    Given I am on login site
    When I click on "Sign In"
    And I enter data
      | Fields   | Value            |
      | email    | wrong-mail@to.me |
      | password | password         |
    And I click the login button
    Then I should get warning
    And I close the browser
