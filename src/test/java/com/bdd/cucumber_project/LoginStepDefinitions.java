package com.bdd.cucumber_project;

import com.bdd.PageObejct.CollectionsPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();
	SignInPage signInPage = SignInPageProvider.getInstance();
	CollectionsPage collectionsPage = CollectionsPageProvider.getInstance();

	@And("^I click the login button")
	public void i_click_the_login_button(){
		collectionsPage = signInPage.submitForm();
	}
	
	@Then("^I should get warning$")
	public void i_should_get_warning() {
		Assert.assertTrue(signInPage.getWarning().equals("Invalid email or password."));
	}
	
	@When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_email_and_password(String email, String password){
		signInPage.setEmail(email).setPassword(password);
	}
}
