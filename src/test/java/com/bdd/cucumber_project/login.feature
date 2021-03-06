Feature: Login page should allow to log in user with proper credentials
  		and log out user who is logged in
  		and should not allow to log in user without proper credentials

  Scenario: User should be able to login with proper credentials
    Given I am on "http://courses.ultimateqa.com" page
    When I click on "Sign In" text
    And I enter email "email@to.me" and password "password"
    And I login 
    Then I should get information "Signed in successfully."
    And I close the browser

  Scenario: User who was logged in should be able to log out
    Given I am on "http://courses.ultimateqa.com" page
    When I click on "Sign In" text
    And I enter email "email@to.me" and password "password"
    And I login 
    Then I click the user avatar 
    And I click on "Sign Out" text
    And I should get information "Signed out successfully."
    And I close the browser

  Scenario Outline: User should not be able to login without proper credentials
    Given I am on "http://courses.ultimateqa.com" page
    When I click on "Sign In" text
    And I enter email "<Email>" and password "<Password>"
    And I login
    Then I should get information "<Information>"
    And I close the browser

    Examples: 
      | Email            | Password | Information                |
      | wrong-mail@to.me | password | Invalid email or password. |
      | email@to.me      | pass     | Invalid email or password. |
      | email@to         | password | Invalid email or password. |
      | email@to.me.now  | password | Invalid email or password. |
      |                  |          | Invalid email or password. |
