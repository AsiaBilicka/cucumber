package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;
import com.bdd.PageObejct.ProfilePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class AccountStepDefinitions {
	
	AccountHeaderPage accountHeaderPage = AccountHeaderPageProvider.getInstance();
	ProfilePage profilePage = ProfilePageProvider.getInstance();
	
	@Then("^I should get information \"([^\"]*)\"$")
	public void i_should_get_inforation(String information) throws InterruptedException {
		Assert.assertTrue(accountHeaderPage.getWarning().equals(information));
	}

	@Then("^I click the user avatar$")
	public void i_click_the_user_avatar(){
		accountHeaderPage.clickAvatar();
	}

	@And("^I upload the image$")
	public void i_upload_the_image() throws InterruptedException {
		profilePage.uploadImage();
		Thread.sleep(3000);
	}

	@Then("^I should see the image as avatar$")
	public void i_should_see_the_image_as_avatar() {
		Assert.assertTrue(profilePage.checkAvatar().contains("data:image/jpeg"));
	}
	
	@And("^I save my account$")
	public void i_save_my_account() {
		profilePage.saveProfile();
	}

	
}
