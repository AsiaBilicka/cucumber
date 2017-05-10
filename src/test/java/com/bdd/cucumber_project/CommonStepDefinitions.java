package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();
	SignInPage signInPage;
	AccountHeaderPage accountHeaderPage = AccountHeaderPageProvider.getInstance();

	@Given("^I am on landing page$")
	public void i_am_on_landing_page() { 
		landingPage.navigateToWebApp();
	}

	@When("^^I click on \"([^\"]*)\"$")
	public void i_click_on(String linkText){
		signInPage = landingPage.navigateToSignInPage(linkText);
	}
	
	@When("^I go to \"([^\"]*)\"$")
	public void i_go_to(String url) {
		signInPage = landingPage.navigateToAccount(url);
	}
	
	@And("^I close the browser$")
	public void i_close_the_browser() {
		cleanUp();
	}

	private void cleanUp() {
		DriverProvider.removeInstance();
		AccountHeaderPageProvider.removeInstance();
		SignInPageProvider.removeInstance();
		LandingPageProvider.removeInstance();
	}
	
}
