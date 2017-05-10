package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();
	SignInPage signInPage = SignInPageProvider.getInstance();
	AccountHeaderPage accountHeaderPage = AccountHeaderPageProvider.getInstance();

	@And("^I click the login button")
	public void i_click_the_login_button(){
		accountHeaderPage = signInPage.submitForm();
	}
	
	@Then("^I should get information \"([^\"]*)\"$")
	public void i_should_get_inforation(String information) throws InterruptedException {
		Assert.assertTrue(signInPage.getWarning().equals(information));
	}
	
	@When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_email_and_password(String email, String password){
		signInPage.setEmail(email).setPassword(password);
	}
}
