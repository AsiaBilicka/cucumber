package com.bdd.cucumber_project;

import com.bdd.PageObejct.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class LoginStepDefinitions {
	
	SignInPage signInPage = SignInPageProvider.getInstance();

	@And("^I click the login button")
	public void i_click_the_login_button(){
		signInPage.submitForm();
	}
	
	@When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_email_and_password(String email, String password){
		signInPage.setEmail(email).setPassword(password);
	}
}
