package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;

import com.bdd.PageObejct.CollectionsPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonStepDefinitions  extends AbstractStepDefinitions{
	
	WebDriver driver = getDriver();
	LandingPage landingPage = getLandingPage();
	SignInPage signInPage;
	CollectionsPage collectionsPage = getCollectionsPage();
	
	
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
	public void i_close_the_browser(){
		collectionsPage.closeDriver();
	}
	
}