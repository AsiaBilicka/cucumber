package com.bdd.cucumber_project;

import com.bdd.PageObejct.LandingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonStepDefinitions {
	
	LandingPage landingPage = LandingPageProvider.getInstance();

	@Given("^I am on \"([^\"]*)\" page$")
	public void i_am_on_landing_page(String url) {
		landingPage.navigateToWebApp(url);
	}

	@When("^^I click on \"([^\"]*)\" text$")
	public void i_click_on(String linkText){
		landingPage.clickByText(linkText);
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
