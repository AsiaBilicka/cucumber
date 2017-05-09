package com.bdd.cucumber_project;

import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class AccountStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();
	SignInPage signInPage = SignInPageProvider.getInstance();
	
	@Then("^I should be informed I need to log in$")
	public void i_should_be_informed_I_need_to_log_in() {
		Assert.assertTrue(signInPage.getWarning().equals("You need to sign in or sign up before continuing."));
	}

}
