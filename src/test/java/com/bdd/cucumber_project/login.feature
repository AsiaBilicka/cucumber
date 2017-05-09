Feature: Login

  Scenario: User should be able to login with proper credentials
    Given I am on landing page
    When I click on "Sign In"
    And I enter email "email@to.me" and password "password"
    And I click the login button
 #   Then I check the confirmation message
    And I close the browser


  Scenario Outline: User should be informed if he has used wrong email format
    Given I am on landing page
    When I click on "Sign In"
    And I enter email "<Email>" and password "<Password>"
    And I click the login button
    Then I should get warning
    And I close the browser

    Examples: 
      | Email            | Password |
      | wrong-mail@to.me | password |
      | email@to.me      | pass     |
      | email@to         | password |
      | email@to.me.now  | password |



