Feature: Account page should be accesable for user who is logged in only
		and should allow user to work with account settings

  Scenario: Not logged in user should not be able to reach his account
    Given I am on "http://courses.ultimateqa.com/account" page
    Then I should get information "You need to sign in or sign up before continuing."
    And I close the browser

 Scenario: Logged in user should be able to update his avatar
 	Given I am on "http://courses.ultimateqa.com/users/sign_in" page
 	And I enter email "email@to.me" and password "password"
    And I click the login button
 	When I click the user avatar
 	And I click the account button
 	And I upload the image
 	Then I should see the image as avatar
 	
 	
 #Scenario: Logged in user should be able to update his email and password and log in with new credentials