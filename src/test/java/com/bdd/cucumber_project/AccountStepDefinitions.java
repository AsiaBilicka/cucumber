package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class AccountStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();
	SignInPage signInPage = SignInPageProvider.getInstance();
	AccountHeaderPage accountHeaderPage = AccountHeaderPageProvider.getInstance();
	
	@Then("^I should be informed I need to log in$")
	public void i_should_be_informed_I_need_to_log_in() {
		Assert.assertTrue(signInPage.getWarning().equals("You need to sign in or sign up before continuing."));
	}
	
	@Then("^I click the user avatar$")
	public void i_click_the_user_avatar(){
		//todo wait for element not present
		accountHeaderPage.clickAvatar();
	}

	@And("^I click the logout button$")
	public void i_click_the_logout_button(){
		accountHeaderPage.logOut();
	}
}
