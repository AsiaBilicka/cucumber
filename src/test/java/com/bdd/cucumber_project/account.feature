Feature: Account page should be accesable for user who is logged in only
  and should allow user to work with account settings

  # Scenario: Not logged in user should not be able to reach his account
  #   Given I am on "http://courses.ultimateqa.com/account" page
  #   Then I should get information "You need to sign in or sign up before continuing."
  #   And I close the browser
 # Scenario: Logged in user should be able to upload his avatar
 #   Given I am on "http://courses.ultimateqa.com/users/sign_in" page
 #   And I enter email "email@to.me" and password "password"
 #   And I login
 #   When I click the user avatar
 #   And I click on "My Account" text
 #   And I upload the image
 #   Then I should see the image as avatar
 #   And I close the browser

 # Scenario: Logged in user should be able to update his avatar and get an information it was updated
 #   Given I am on "http://courses.ultimateqa.com/users/sign_in" page
 #   And I enter email "email@to.me" and password "password"
 #   And I login
 #   When I click the user avatar
 #   And I click on "My Account" text
 #   And I upload the image
 #   And I save my account
 #   Then I should get information "Your profile was successfully updated."
 #   And My profile avatar should be changed
 #   And I close the browser

	@userProfileDataCleanUp
  Scenario: Logged in user should be able to update his profile data
    Given I am on "http://courses.ultimateqa.com/users/sign_in" page
    And I enter email "email@to.me" and password "password"
    And I login
    When I click the user avatar
    And I click on "My Account" text
    And I update profile with valid data
      | Field     | Value              |
      | email     | example@email.now  |
      | firstname | Asia               |
      | lastname  | Bilicka            |
      | company   | Company            |
      | title     | Boss Of Everything |
      | timezone  | Warsaw             |
	And I save my account
  Then I should get information "Your profile was successfully updated."
#  And I should have new data saved 
#  And I close the browser
