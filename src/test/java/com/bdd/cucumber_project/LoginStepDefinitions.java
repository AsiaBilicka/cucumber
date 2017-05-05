package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;

import com.bdd.PageObejct.CollectionsPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinitions  extends AbstractStepDefinitions{
	
	WebDriver driver = getDriver();
	LandingPage landingPage = getLandingPage();
	SignInPage signInPage = getSignInPage();
	CollectionsPage collectionsPage = getCollectionsPage();
	
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
