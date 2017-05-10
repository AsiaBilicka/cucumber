package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class AccountStepDefinitions {
	
	SignInPage signInPage = SignInPageProvider.getInstance();
	AccountHeaderPage accountHeaderPage = AccountHeaderPageProvider.getInstance();
	
	@Then("^I should get information \"([^\"]*)\"$")
	public void i_should_get_inforation(String information) throws InterruptedException {
		Assert.assertTrue(accountHeaderPage.getWarning().equals(information));
	}

	@Then("^I click the user avatar$")
	public void i_click_the_user_avatar(){
		accountHeaderPage.clickAvatar();
	}

	@And("^I click the logout button$")
	public void i_click_the_logout_button(){
		accountHeaderPage.logOut();
	}
}
