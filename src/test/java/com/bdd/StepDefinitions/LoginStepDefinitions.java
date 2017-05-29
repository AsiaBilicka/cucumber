package com.bdd.StepDefinitions;

import com.bdd.PageObejcts.SignInPage;
import com.bdd.Providers.SignInPageProvider;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class LoginStepDefinitions {
	
	SignInPage signInPage = SignInPageProvider.getInstance();

	@And("^I login")
	public void login(){
		signInPage.submitForm();
	}
	
	@When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_email_and_password(String email, String password){
		signInPage.setEmail(email);
		signInPage.setPassword(password);
	}
	
}
