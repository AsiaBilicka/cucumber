package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.PageObejct.CollectionsPage;
import com.bdd.PageObejct.LandingPage;
import com.bdd.PageObejct.SignInPage;

public class AbstractStepDefinitions {
	
	protected static WebDriver driver;
	protected static LandingPage landingPage;
	protected static CollectionsPage collectionsPage;
	protected static SignInPage signInPage;
	
	protected WebDriver getDriver(){
		if(driver == null){
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	protected LandingPage getLandingPage(){
		if (landingPage == null){
			landingPage = new LandingPage(driver);
		}
		return landingPage;
	}

	protected CollectionsPage getCollectionsPage(){
		if(collectionsPage == null){
			collectionsPage = new CollectionsPage(driver);
		}
		return collectionsPage;
	}
	
	protected SignInPage getSignInPage(){
		if(signInPage == null){
			signInPage = new SignInPage(driver);
		}
		return signInPage;
	}
}
