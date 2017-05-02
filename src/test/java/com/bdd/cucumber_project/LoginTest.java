package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.PageObejct.CollectionsPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginTest {
	
	WebDriver driver = new ChromeDriver();
	LandingPage landingPage;
	SignInPage signInPage;
	CollectionsPage collectionsPage;
	
	@Given("^I am on login site$")
	public void i_am_on_login_site() { 
		landingPage = new LandingPage(driver);
		landingPage.navigateToWebApp();
	}

	@When("^^I click on \"([^\"]*)\"$")
	public void i_click_on(String linkText){
		signInPage = landingPage.navigateToSignInPage(linkText);
	}
	
	@And("^I enter data$")
	public void i_insert_proper_login_and_password(DataTable table) {
		signInPage.setEmail(table).setPassword(table);	
	}
	
	@And("^I click the login button")
	public void i_click_the_login_button(){
		collectionsPage = signInPage.submitForm();
	}

	@Then("^I check the url$")
	public void i_check_the_url() {
		Assert.assertTrue(collectionsPage.getUrl().equals("http://courses.ultimateqa.com/collections"));
	}
	
	@And("^I close the browser$")
	public void i_close_the_browser(){
		collectionsPage.closeDriver();
	}
	
	@Then("^I should get warning$")
	public void i_should_get_warning() {
		Assert.assertTrue(signInPage.getWarning().equals("Invalid email or password."));
	}

}
